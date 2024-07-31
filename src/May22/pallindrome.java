package src.May22;

import java.util.Scanner;

public class pallindrome {

    public static void main(String rgs[])
    {

         /* Logic:-
            Get the number to check for palindrome
            Hold the number in temporary variable
            Reverse the number
            Compare the temporary number with reversed number
            If both numbers are same, print "palindrome number"
            Else print "not palindrome number"
            Steps:-

          */

        Scanner sc =  new Scanner(System.in);
        System.out.println("Provide a number");
        int num = sc.nextInt();

        int rem, sum = 0, temp;
        temp = num;

        while (num>0) {
            rem = num % 10; //getting remiender
            sum = (sum * 10) + rem;
            num = num / 10; //getting quotient

        }

        if (sum==temp)
        {
            System.out.println(temp + " is a palindrome Number");
        }
        else
        {
            System.out.println(temp + " is not palindrome Number");
        }




    }
}
