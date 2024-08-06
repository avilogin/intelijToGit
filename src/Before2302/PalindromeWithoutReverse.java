package src.Before2302;

import java.util.Scanner;

public class PalindromeWithoutReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a string");

        String name = sc.next();
        String Original_str = name;

        if (name ==null)
        {
            System.out.println("String is not Pallindrome");
        }
        else if (name.length()<=1)
        {
            System.out.println("String is Pallondrome");
        }
        else
        {
            String rev = "";

            for (int i =name.length()-1;i>=0;i--)
            {
                rev = rev+name.charAt(i);
            }

            boolean result = Original_str.equalsIgnoreCase(rev);


            if (result)
            {
                System.out.println("It is a Palindrome");
            }
            else
            {
                System.out.println("It is not a Palindrome");
            }

        }

    }
    }

