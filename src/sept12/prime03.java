package src.sept12;

import java.util.Scanner;

public class prime03 {
    //Prime or not from user input
    public static void main(String[] args) {

        Boolean prime = true;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Provide the Number");
        int num = sc.nextInt();
        if(num<0)
        {
            System.out.println("Number is Negative..Please Provide a valid number");
        }
else if(num>0)
{
    for (int i = 2; i < num; i++) {
        if (num % i == 0) {
            prime = false;
            break;
        }
    }
    if (prime)
    {
        System.out.println(num + " is Prime");
    } else {
        System.out.println(num + " is not Prime");
    }
}
else if(num==0)
{
    System.out.println("Number is Zero..Please Provide a valid number");
}


    }
}
