package src.BasicPrograms;

import java.util.Scanner;

public class addTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide first Number");
        Integer first = sc.nextInt();
        System.out.println("Provide second Number");
        Integer second = sc.nextInt();
        Integer sum = first+second;
        System.out.println(sum);

        System.out.println("---------------------");
        int a = 20;
        int b = 30;
        int c = a+b;
        System.out.println(c);

    }
}
