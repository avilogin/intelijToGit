package src.SeptPractice.sept12;

public class compareStrings {
    public static void main(String[] args) {
        String  a  = "Apple";
        String b = "apple";
        System.out.println("a is " +a);
        System.out.println("b is "+b);

        System.out.println("---------equal()-------");
        if (a.equals(b))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
        System.out.println("---------equalsIgnoreCase()-------");
        if (a.equalsIgnoreCase(b))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
        System.out.println("--------------compareTo()-----------");
        System.out.println(a.compareTo(b));
        System.out.println("---------double Equals-------");
        if (a==b)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }





    }
}