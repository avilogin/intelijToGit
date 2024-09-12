package src.sept12;

import java.util.Scanner;

public class largeInArray02 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Provide the total numbers");
        int count = sc.nextInt();
        int[] num = new int[count] ;

        System.out.println("Provide the numbers");
        for (int i =0;i<count;i++)
        {
            num[i]= sc.nextInt();

        }
        int max = num[0];

        for (int i =1;i<num.length;i++)
        {
            if (num[i]>max)
            {
                max = num[i];
            }
        }
        System.out.println("Largest number is "+max);


    }
}
