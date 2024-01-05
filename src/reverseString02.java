package src;

import java.util.Scanner;

public class reverseString02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a string");

        String name = sc.next();

        String rev = "";

        for (int i =name.length()-1;i>=0;i--)
        {
            rev = rev+name.charAt(i);
        }

        System.out.println(rev);

    }
    }

