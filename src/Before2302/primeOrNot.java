package src.Before2302;

import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide a Number = ");
        int num = sc.nextInt();
        boolean prime = true;
        if (num==0)
        {
            System.out.println("Its 0..Please provide another number");
        }
        else if (num>0)
        {
            for (int i=2; i<num;i++)
            {
                if (num%i==0)
                {
                    prime = false;
                    break;
                }

            }
            if (prime)
            {
                System.out.println(num+" is a Prime Number");
            }
            else
            {
                System.out.println(num+" is Not a Prime Number");
            }

        }
        else
        {
            System.out.println("Its a negative number. Please provide a positive Number");
        }

    }
}
