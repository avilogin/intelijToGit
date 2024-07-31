package src.BasicPrograms;

import java.util.Scanner;

public class PallindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a String");
        String string = sc.next();
        String rev = "";
        String origStr = string;

        for (int i =string.length()-1;i>=0;i--)
        {
            rev =rev+string.charAt(i);
        }
        if(origStr.equalsIgnoreCase(rev))
        {
            System.out.println("Pallindrome");
        }
        else
            System.out.println("Not Pallindrome");

    }
}
