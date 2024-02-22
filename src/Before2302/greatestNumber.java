package src.Before2302;

import java.util.Scanner;

public class greatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide first Number");
        int num1 = sc.nextInt();
        System.out.println("Provide second Number");
        int num2 = sc.nextInt();
        System.out.println("Provide third Number");
        int num3 = sc.nextInt();


            if (num1 > num2 && num1 > num3) {
                System.out.println(num1 + " is the Greatest Number");
            } else if (num2 > num1 && num2 > num3) {
                System.out.println(num2 + " is the Greatest Value");
            } else if (num3 > num1 && num3 > num2) {
                System.out.println(num3 + " is the Greatest Value");
            }





    }
}
