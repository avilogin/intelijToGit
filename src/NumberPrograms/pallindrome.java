package src.NumberPrograms;

import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        int temp, rem, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the number");
        int num = sc.nextInt();
        temp = num;
        while (num>0)
        {
            rem = num%10;
            sum = (sum*10)+rem;
            num = num/10;
        }
        if (sum==temp)
        {
            System.out.println("Pallindrome");
        }
        else
            System.out.println("Not Pallindrome");

    }
}
