package src.May22;

import java.util.Scanner;

public class primeornot02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a number");
        Integer num = sc.nextInt();

        Boolean isPrime = true;

        if (num==0)
        {
            System.out.println("Number is zero");
        }
        else if (num>0)
        {
            for (int i = 2;i<num;i++)
            {
                if(num%i==0)
                {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not Prime");
            }

        }
        else
        {
            System.out.println("Number is negative");
        }

    }
}
