package src.May22;


class parent
{
    void print()
    {
        System.out.println("Parent Method");
    }
}

class child extends parent
{
    void print()
    {
        System.out.println("Child class");
    }
}

public class MethodOverriding {



    public static void main(String[] args) {

        //Method print was overloaded here
         parent p1 = new child();
         p1.print();
        System.out.println("-----------");

         parent p2 = new parent();
         p2.print();
        System.out.println("-----------");

         child p3 = new child();
         p3.print();

    }
}
