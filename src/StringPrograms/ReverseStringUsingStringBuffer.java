package src.StringPrograms;

import java.util.Scanner;

public class ReverseStringUsingStringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a String");
        String string = sc.next();

        StringBuffer str = new StringBuffer(string);
        //StringBuffer result = str.reverse();
        //or
        String result = str.reverse().toString();
        System.out.println(result);
    }
}
