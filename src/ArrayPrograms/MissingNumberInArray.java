package src.ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumberInArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Provide the range of array");
        int range = sc.nextInt();
        int [] arr = new int[range];
        int sum = 0, expectedSum = 0;

        System.out.println("Provide the numbers of array");
        //for taking input
        for (int i =0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }

        //for printing array
//        for (int i =0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]);
//        }

        //or
        System.out.println(Arrays.toString(arr));

        //for counting the sum of array
        for (int i =0;i<arr.length;i++)
        {
            sum = sum+arr[i];
        }

        //for counting the sum of expected array  21
        for (int i =0;i<=range;i++)
        {
            expectedSum = expectedSum+i;
        }

        System.out.println("Missing element is "+(expectedSum-sum));





    }
}
