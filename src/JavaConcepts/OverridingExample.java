package src.JavaConcepts;

public class OverridingExample
{
    public void demo()
    {
        System.out.println("This is a Parent Class");
    }
}

class ChildClass extends OverridingExample
{
   public void demo()
   {
       super.demo();
       System.out.println("This is a Child Class");
   }


}

class run
{
    public static void main(String[] args) {
        ChildClass c = new ChildClass();
        c.demo();

    }
}