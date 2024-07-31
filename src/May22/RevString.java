package src.May22;

import java.util.Scanner;

public class RevString {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Provide a string");
        String str = sc.next();
        Boolean result = ispalindrome(str);

        if(result)
        {
            System.out.println(str + " is palindrome");
        }
        else
        {
            System.out.println(str + " is not a palindrome");
        }

    }
    public static boolean ispalindrome(String str)
    {

        String orig_str = str;
        StringBuilder sb = new StringBuilder(str);
        String rev_str = sb.reverse().toString();
        return orig_str.equalsIgnoreCase(rev_str);


    }
}
