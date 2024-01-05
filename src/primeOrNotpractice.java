package src;

import java.util.Scanner;

public class primeOrNotpractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Provide a Number");
        int num = sc.nextInt();
        boolean isPrime= true;
        if (num>0) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }

            }

            if (isPrime) {
                System.out.println(num + " is a Prime Number");
            } else {
                System.out.println(num + " is Not a Prime Number");
            }
        }
        else
        {
            System.out.println("Its a negative Number or 0..Please Provide a Positive Number");
        }
    }

}
