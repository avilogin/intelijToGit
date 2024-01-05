package src;

import java.util.Scanner;
import java.util.SortedMap;

public class tablePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the a number");
        int num = sc.nextInt();
        System.out.println("Provide the number of multiplications you want");
        int mul = sc.nextInt();

        for (int i=1;i<=mul;i++)
        {
            System.out.println(num +" X "+i+" = "+num*i);
        }
    }
}
