package src.Practice;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide a Number = ");
        int num = sc.nextInt();
        boolean prime  = true;

        if (num<0)
        {
            System.out.println("Negative");
        }
        else if (num>0)
        {
            for (int i =2; i<num;i++)
            {
                if (num%i==0)
                {
                    prime = false;
                    break;
                }
            }
            if (prime)
            {
                System.out.println("Prime");
            }
            else
                System.out.println("Not Prime");
        }
    }
}
