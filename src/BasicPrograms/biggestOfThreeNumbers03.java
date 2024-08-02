package src.BasicPrograms;

import java.util.Scanner;

public class biggestOfThreeNumbers03 {

    //Using math function
    public static void main(String[] args) {
        int first, second, third ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide first Number");
         first = sc.nextInt();
        System.out.println("Provide Second Number");
         second = sc.nextInt();
        System.out.println("Provide third Number");
         third = sc.nextInt();

        int temp = Math.max(first,second);
        int lar = Math.max(temp,third);
        System.out.println("Largest is "+lar);


    }
}
