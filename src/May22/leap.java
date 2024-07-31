package src.May22;

import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a year and i'll tell its a leap year or not");
        int year = sc.nextInt();

        if ((year%4 ==0) &&(year%100 ==0) || (year %400==0))
        {
            System.out.println("Leap Year");
        }
        else
            System.out.println("Not a leap year");
    }
}
