package src.May22;

import java.util.Scanner;

public class revstring03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a string");
        String str = sc.next();
        String orig = str;

        String rev = "";

        for (int i = str.length()-1;i>=0;i--)
        {
            rev = rev+str.charAt(i);
        }
        boolean result = str.equalsIgnoreCase(rev);

        if(result)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
