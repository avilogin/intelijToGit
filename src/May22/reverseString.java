package src.May22;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a string");
        String val= sc.next();

        String original_str = val;
        String rev = "";


        for(int i = val.length()-1;i>=0;i--)
        {
            rev = rev+val.charAt(i);
        }
        System.out.println(rev);

    }
}
