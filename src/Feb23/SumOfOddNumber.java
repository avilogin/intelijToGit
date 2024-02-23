package src.Feb23;

import java.util.Scanner;

public class SumOfOddNumber {

    public static void main(String[] args) {
        //Write a Java program that displays the sum of n odd natural numbers.

        Integer sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the Term Number");
        Integer num =  sc.nextInt();

        System.out.println("The Term Number is : "+num);

        System.out.println("The Odd numbers are : ");
        for (int i = 1; i<=num;i++)
        {
            System.out.println(2*i-1);
            sum += 2*i-1;
        }
        System.out.println("The sum of all odd Numbers are : "+sum);
    }
}
