package src.SeptPractice.Sept25;

public class child extends parent
{
    static void print()
    {
        System.out.println("Child class");
    }
    
}

class run
{
    public static void main(String[] args) {
       parent.print();
       child.print();

       parent p = new child();
       p.print();
       child c = new child();
       c.print();



    }
}
