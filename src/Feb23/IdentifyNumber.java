package src.Feb23;

import java.util.Scanner;

public class IdentifyNumber {
    /*
    Write a Java program that reads a floating-point number
    and prints "zero" if the number is zero.
    Otherwise, print "positive" or "negative".
    Add "small" if the absolute value of the number is less than 1,
    or "large" if it exceeds 1,000,000.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a Value");
        double input = sc.nextDouble();

        if (input>0)
        {
            if (input < 1)
            {
                System.out.println("Positive Small Number");
            }
            else if (input > 1000000)
            {
                System.out.println("Positive Large Number");
            }
            else
            {
                System.out.println("Positive Number");
            }

        }

        else if (input<0)
        {
            if (Math.abs(input) <1)
            {
                System.out.println("Negative Small Number");
            }
            else if (Math.abs(input)>1000000)
            {
                System.out.println("Negative Large Number");
            }
            else
            {
                System.out.println("Negative Number");
            }

        }

        else
        {
            System.out.println("Zero");
        }
    }

}
