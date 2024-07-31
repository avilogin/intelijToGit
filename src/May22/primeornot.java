package src.May22;

import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a number");
        Integer num = sc.nextInt();
        Boolean prime = true;

        if(num==0)
        {
            System.out.println("Number is zero");
        }
        else if (num>0)
        {
            for(int i =2;i<num;i++)
            {
                if(num%i==0)
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
            {
                System.out.println("Not prime");
            }
        }
        else
        {
            System.out.println("Number is negative");
        }
    }
}
