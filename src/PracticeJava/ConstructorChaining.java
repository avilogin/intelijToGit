package src.PracticeJava;

public class ConstructorChaining {

    ConstructorChaining()
    {
        System.out.println("Parent Class");
    }
}

class ChildClass extends ConstructorChaining
{
    ChildClass()
    {
        System.out.println("Child Class");
    }
}

class test {
    public static void main(String[] args) {
        ChildClass c =  new ChildClass();

    }
}