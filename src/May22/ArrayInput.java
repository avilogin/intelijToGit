package src.May22;

import java.util.Scanner;

public class ArrayInput {


        public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Provide the elements");

        for(int i=0; i<size; i++)
        {
            arr[i]= sc.nextInt();
        }

        for(int j=0; j<size; j++)
        {
            System.out.println(arr[j] +"\t");
        }
        sc.close();

    }
    }


