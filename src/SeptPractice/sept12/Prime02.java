package src.SeptPractice.sept12;

import java.util.Scanner;

public class Prime02 {
    // prime from 1 to n
    public static void main(String[] args) {
        int num = 0;
        String prime = "";
        Scanner sc  = new Scanner(System.in);
        System.out.println("Provide the number");
        int fin = sc.nextInt();

        for (int i =1;i<=fin;i++)
        {
            int count =0;
            for (num = i;num>=1;num--)
            {
               if (i%num==0)
               {
                   count = count +1;
               }
            }
            if (count ==2)
            {
                prime = prime + i +" ";
            }
        }
        System.out.println(prime);
    }
}
