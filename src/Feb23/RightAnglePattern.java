package src.Feb23;

import java.util.Scanner;

public class RightAnglePattern {
    /*
    Write a Java program to display the pattern like
    a right angle triangle with a number.
     */
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Provide the Number to display ");
        Integer num =  sc.nextInt();

        System.out.println("The Number is : "+num);

        for (int i =1;i<=num;i++)
        {
            for (int j =1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }


    }
}
