package src.JavaConcepts;

interface test1
{
    void print001();
}
interface test2
{
    void print002();
}

class test3
{
    void print003()
    {
        System.out.println("Class Method");
    }
}

class  test4 extends test3 implements test1,test2
{
    @Override
    public void print001() {
        System.out.println("First interface method");

    }

    @Override
    public void print002() {
        System.out.println("Second interface method");

    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        test4 t =  new test4();
        t.print001();
        t.print002();
        t.print003();

    }
}
