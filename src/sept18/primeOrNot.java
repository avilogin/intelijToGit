package src.sept18;

public class primeOrNot {
    public static void main(String[] args) {

        int num = 97;
        boolean prime = true;
        for (int i = 2;i<num;i++)
        {
            if (num%i==0)
            {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}
