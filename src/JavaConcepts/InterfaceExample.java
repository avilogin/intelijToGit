package src.JavaConcepts;

interface  demo1
{
    void print1();

}

class demo2 implements demo1
{

    @Override
    public void print1() {
        System.out.println("This is a abstract method of an interface");
    }
    public void print2()
    {
        System.out.println("This is a normal method");
    }
}


public class InterfaceExample {

    public static void main(String[] args) {
        demo2 d = new demo2();
        d.print1();
        d.print2();

    }
}
