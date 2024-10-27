package src.Feb23;

import java.util.Scanner;

public class NumberOfDigits {

    /*
    Write a Java program that reads an positive integer and
    count the number of digits the number (less than ten billion) has.
     */

    public static void main(String[] args) {
         long count=0;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Provide a Number");
        long num =  sc.nextInt();

       while (num!=0)
       {
           num = num/10;
           count++;
       }
        System.out.println("Count is "+count);

    }
}
