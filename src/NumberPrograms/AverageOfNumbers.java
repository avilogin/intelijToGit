package src.NumberPrograms;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the count of numbers");
        int num = sc.nextInt();
        int count = 1,temp = 0,sum = 0;
        double avr;
        while (count<=num)
        {
            System.out.println("Enter the "+count+" number");
            temp = sc.nextInt();
            sum = sum+temp;
            count++;
        }
        avr = sum/num;
        System.out.println("Average is "+avr);


    }
}
