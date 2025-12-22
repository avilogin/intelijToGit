package src.JavaConcepts;

abstract class absClass
{

    absClass()
    {
        System.out.println("This is a Constructor of abstract class");
    }
    public void test1()
    {
        System.out.println("Test1 Method- This is a Concrete Method");
    }

    abstract void test2();

}

class NormalClass extends absClass
{
    void test2()
    {
        System.out.println("Test2 Method- This is a Abstract method");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        NormalClass n = new NormalClass();
        n.test1();
        n.test2();

        // Using anonymous class
        //We cannot create an object of an abstract class  directly.
        absClass a = new absClass() {
            @Override
            void test2() {
                System.out.println("This is a updated abstract method");
            }
        };
        a.test1();
        a.test2();
    }

}
