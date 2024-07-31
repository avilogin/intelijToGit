package src.May22;

import java.util.Scanner;

public class palindrome02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a number");
        int num = sc.nextInt();

        int rem, temp, sum = 0;
        temp= num;

        while(num>0)
        {
            rem = num%10;
            sum  = (sum *10) + rem;
            num = num/10;

        }

        if (temp == sum)
        {
            System.out.println(temp +" is Palindrome");
        }
        else
            System.out.println(temp +" is not a Palindrome");

    }
}
