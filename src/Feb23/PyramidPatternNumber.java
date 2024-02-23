package src.Feb23;

import java.util.Scanner;

public class PyramidPatternNumber {
    /*
    Write a Java program to make such a pattern like
    a pyramid with a number that repeats in the same row.
     */
    public static void main(String[] args) {


        Scanner sc =  new Scanner(System.in);
        System.out.println("Provide the Number to display ");
        Integer num =  sc.nextInt();

        // loop to iterate for the given number of rows
        for (int i = 1; i <= num; i++) {

            // loop to print the number of spaces before the star
            for (int j = num; j >= i; j--) {
                System.out.print(" ");
            }

            // loop to print the number of stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }

            // for new line after printing each row
            System.out.println();
        }
    }
}
