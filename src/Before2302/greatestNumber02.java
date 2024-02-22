package src.Before2302;

import java.util.Scanner;

public class greatestNumber02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide first Number");
        int num1 = sc.nextInt();
        System.out.println("Provide second Number");
        int num2 = sc.nextInt();
        System.out.println("Provide third Number");
        int num3 = sc.nextInt();

        int max = (num1>num2) ? ((num1>num3) ? num1: num3) : ((num2>num3) ? num2:num3);
        System.out.println(max + " is the Greatest Number");






    }
}
