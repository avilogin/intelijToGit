package src.Before2302;

import java.util.Scanner;

public class positiveOrNegtive {
    public static void main(String[] args) {

//        Write a Java program that reads a floating-point number
//        and prints "zero" if the number is zero.
//        Otherwise, print "positive" or "negative".
//        Add "small" if the absolute value of the number is less than 1,
//        or "large" if it exceeds 1,000,000.


       Scanner sc = new Scanner(System.in);
        System.out.println("Provide a Number");
        double num = sc.nextDouble();

        if (num>0)
        {
            if (num<1)
            {
                System.out.println("Small Positive Number");
            }
            else if (num>1000000)
            {
                System.out.println("Large Positive Number");
            }
            else
            {
                System.out.println("Positive");
            }
        }
        else if (num<0)
        {
            if (Math.abs(num)<1)
            {
                System.out.println("Small Negative Number");
            }
            else if (Math.abs(num)>1000000)
            {
                System.out.println("Large Negative Number");
            }
            else
            {
                System.out.println("Negative");
            }
        }
        else
        {
            System.out.println("Number is Zero");
        }


    }
}
