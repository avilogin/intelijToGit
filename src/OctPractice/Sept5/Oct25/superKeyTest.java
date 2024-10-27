package src.OctPractice.Sept5.Oct25;

class amazon
{
    amazon()
    {
        System.out.println("Calling Amazon");
    }
}
class google extends amazon
{
    google()
    {
        System.out.println("Calling Google");
    }

}
public class superKeyTest extends google
{
    superKeyTest()
    {
        System.out.println("Calling main method");
    }

    public static void main(String[] args) {
         new superKeyTest();

    }
}
