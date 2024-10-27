package src.OctPractice.Sept5.Oct26;

import java.util.Scanner;

public class greatestofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide first Number");
        int first = sc.nextInt();
        System.out.println("Provide second Number");
        int second = sc.nextInt();
        System.out.println("Provide third Number");
        int third = sc.nextInt();
        int max;

        max = first>second ? first: second;
        max = max>third ? max : third;
        System.out.println("Max is "+max);
    }
}
