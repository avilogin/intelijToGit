package src.Feb27;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int i, n1=0, n2 =1, n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the Number of series");
        int num = sc.nextInt();

        System.out.print(n1+" "+n2);
        for (i=2;i<num;i++)
        {
            n3 = n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
