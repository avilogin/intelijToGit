package src.NumberPrograms;

import java.util.Scanner;

public class swapTwoNumbersWithout {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Provide 2 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("First number is "+num1);
        System.out.println("Second Number is "+num2);

        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("After swapping");
        System.out.println("First number is "+num1);
        System.out.println("Second Number is "+num2);

    }
}
