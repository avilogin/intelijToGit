package src.OctPractice.Sept5.Oct26;

import java.util.Scanner;

public class findAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the number of digits");
        int num = sc.nextInt();
        int count = 1, temp , sum = 0;
        double average = 0;


        while (count<=num)
        {
            System.out.println("Provide the "+count+" number");
            temp = sc.nextInt();
            sum = sum+temp;
            count++;
        }
        average = sum/num;
        System.out.println("Average of "+sum+" is "+average);

    }
}
