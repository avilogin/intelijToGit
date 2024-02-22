package src.Before2302;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a string");

        String name = sc.next();
        char [] arr = name.toCharArray();

        int left =0;
        int right = arr.length-1;

        while (left<right)
        {
            char temp = arr[left];
            arr[left]= arr[right];
            arr[right]= temp;

            left++;
            right--;

        }
        String rev_str = new String(arr);
        System.out.println(rev_str);


    }



    }

