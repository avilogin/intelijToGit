package src.Before2302;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
            /* Logic:-
            Get the number to check for palindrome
            Hold the number in temporary variable
            Reverse the number
            Compare the temporary number with reversed number
            If both numbers are same, print "palindrome number"
            Else print "not palindrome number"
            Steps:-
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a Number");
        int n = sc.nextInt();
        int r,sum=0,temp;
        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r; //will use it to compare with the temporary value
            n=n/10; //Getting quotient
        }
        if(temp==sum)
            System.out.println(temp +" is a palindrome number ");
        else
            System.out.println(temp +" is not a palindrome Number");
    }
}
