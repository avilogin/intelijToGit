package src.sept13;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide Number");
        int num = sc.nextInt();
        boolean prime = true;
        for (int i =2;i<num;i++)
        {
            if (num%i==0)
            {
                prime = false;
                break;
            }

        }
        if (prime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
