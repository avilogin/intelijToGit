package src.Feb23;

import java.util.Scanner;

public class NumberOfDigits {

    /*
    Write a Java program that reads an positive integer and
    count the number of digits the number (less than ten billion) has.
     */

    public static void main(String[] args) {
        Integer count =0,rem;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Provide a Number");
        Integer num =  sc.nextInt();

        for (int i =1;i<=num;i++)
        {
            rem = num%10;
            count++;
        }
        System.out.println(count);

    }
}
