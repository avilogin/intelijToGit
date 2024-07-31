package src.May22;

import java.util.Scanner;

public class revString02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide a string");
        String input  = sc.next();

        Boolean results = ispalindrome(input);
        if (results)
        {
            System.out.println("pallindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }

    }

    public static boolean ispalindrome(String input)
    {
        String orig_str = input;
        StringBuilder sc = new StringBuilder(input);
        String rev_str = sc.reverse().toString();
        return orig_str.equalsIgnoreCase(rev_str);
    }
}
