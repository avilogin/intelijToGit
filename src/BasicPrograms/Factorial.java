package src.BasicPrograms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the number");
        int num = sc.nextInt();
        for (int i=1;i<=num;i++)
        {
            fact = fact*i;

        }
        System.out.println("Factorial is "+fact);
    }
}
