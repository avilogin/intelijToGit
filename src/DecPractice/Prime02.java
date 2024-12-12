package src.DecPractice;

import java.util.Scanner;

public class Prime02 {
    public static void main(String[] args) {
        boolean prime = true;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Provide a Number");
        int num = sc.nextInt();

        if (num<0)
        {
            System.out.println("Number is less than Zero. Please provide another Number");
        } else if (num==0)
        {
            System.out.println("Number is Zero. Please Provide another Number");
        } else if (num>0)
        {
            for (int i =2;i<num;i++)
            {
                if (num%i==0)
                {
                    prime = false;
                    break;
                }
            }

            if (prime)
            {
                System.out.println(num+ " is Prime Number");
            }
            else
            {
                System.out.println(num+" is Not Prime Number");
            }
        }
    }
}
