package src.sept18;

public class pallindrome {
    public static void main(String[] args) {
        int num = 12343211, copy = num;
        int rem = 0, sum = 0;
        while (num>0)
        {
            rem = num%10;
            sum = (sum*10)+rem;
            num = num/10;
        }
        if (copy==sum )
        {
            System.out.println("Pallindrome");
        }
        else
            System.out.println("Not Pallindrome");
    }
}
