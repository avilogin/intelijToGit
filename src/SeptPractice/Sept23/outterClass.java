package src.SeptPractice.Sept23;

public class outterClass
{
    int normalVariable = 10;
    static int staticVariable = 20;
    public static class innerClass
    {
        int normalStaticVariable = 30;
        public void display()
        {
            //System.out.println("Normal variable = "+normalVariable); Cannot access non static variable of outer class
            System.out.println("Outter Static variable = "+staticVariable);
            System.out.println("Inner non static variable = "+normalStaticVariable);
        }

    }
}
