package src.DecPractice;

import java.util.Scanner;

public class pallindromeString {

    public static void main(String[] args) {
        System.out.println("Provide a String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String rev = "", copy = str;
        for (int i =str.length()-1;i>=0;i--)
        {
            rev = rev+str.charAt(i);
        }
        if (rev.equalsIgnoreCase(copy))
        {
            System.out.println(copy+" is Pallindrome");
        }
        else
        {
            System.out.println(copy+" is not Pallindrome");
        }


    }
}
