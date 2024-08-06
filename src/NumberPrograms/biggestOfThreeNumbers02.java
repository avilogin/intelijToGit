package src.NumberPrograms;

import java.util.Scanner;

public class biggestOfThreeNumbers02 {

    //Using if else
    public static void main(String[] args) {
        int first, second, third ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide first Number");
         first = sc.nextInt();
        System.out.println("Provide Second Number");
         second = sc.nextInt();
        System.out.println("Provide third Number");
         third = sc.nextInt();

        if (first>=second&&first>=third)
        {
            System.out.println("Largest id "+first);
        }
        else if (second>=third&&second>=first) {
            System.out.println("Largest is "+second);

        }
        else

            System.out.println("Largest is "+third);


    }
}
