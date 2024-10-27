package src.OctPractice.Sept5.Oct26;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the Number");
        int num = sc.nextInt();
        int copy = num;
        double count =0, digit = 0, sum = 0;

        //for counting digits
        while(num!=0)
        {
            num = num/10;
            count++;
        }
        num = copy;

        while(num!=0)
        {
            digit =  num%10;
            sum = sum+Math.pow(digit,count);
            num = num/10;

        }
        if(sum == copy)
            System.out.println(copy +" is Armstrong");
        else
            System.out.println(copy +" is not Armstrong");
    }
}
