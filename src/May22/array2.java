package src.May22;

import java.util.Scanner;

public class array2 {


        public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Provide the size of the array");

        int arrSize = sc.nextInt();

        int array[] = new int[arrSize];

        System.out.println("Provide the elemnts of the array");

        for(int i = 0;i<arrSize ; i++)
        {
            array[i] = sc.nextInt();

        }

        for (int j = 0;j<arrSize;j++)
        {
            System.out.println(array[j]+"\t");
        }

        sc.close();



    }

    }


