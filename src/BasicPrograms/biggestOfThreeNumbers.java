package src.BasicPrograms;

import java.util.Scanner;

public class biggestOfThreeNumbers {

    //Using Ternary  operator
    public static void main(String[] args) {
        int first, second, third ,largest,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide first Number");
         first = sc.nextInt();
        System.out.println("Provide Second Number");
         second = sc.nextInt();
        System.out.println("Provide third Number");
         third = sc.nextInt();

        temp = first>second ? first:second;

        largest = third>temp ? third:temp;

        System.out.println("largest number is "+largest);



    }
}
