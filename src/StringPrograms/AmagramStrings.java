package src.StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AmagramStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide first String");
        String first = sc.next();
        System.out.println("Provide second String");
        String second = sc.next();

        char[] arr1 = first.toLowerCase().toCharArray();
        char[] arr2 = second.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2))
        {
            System.out.println("Strings are anagram");
        }
        else
        {
            System.out.println("Strings are not anagram");
        }
    }
}
