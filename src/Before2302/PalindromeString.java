package src.Before2302;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a String and i'll tell it is a Palindrome or Not");
        String input = sc.next();
        boolean result = isPalindrome(input);

        if (result)
        {
            System.out.println("It is a Palindrome");
        }
        else
        {
            System.out.println("It is not a Palindrome");
        }

    }

    private static boolean isPalindrome(String input) {
        String original_str = input;
        StringBuilder sb = new StringBuilder(input);
        String reverse_str = sb.reverse().toString();
        return original_str.equalsIgnoreCase(reverse_str);
    }
}
