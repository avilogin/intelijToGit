package src.BasicPrograms;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a String");
        String string = sc.next();
        String rev = "";

        for (int i = string.length()-1;i>=0;i--)
        {
            rev = rev+string.charAt(i);
        }
        System.out.println("Reverse of the String is "+rev);
    }
}
