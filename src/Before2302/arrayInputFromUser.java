package src.Before2302;

import java.util.Scanner;
import java.util.SortedMap;

public class arrayInputFromUser
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide the size of Array");
        int size = sc.nextInt();
        int arr1[] = new int[size];
        System.out.println("Provide the elements ");
        for (int i=0;i<size;i++)
        {
         arr1[i] = sc.nextInt();
        }
        System.out.println("-----Output------");
        for (int j=0;j<size;j++)
        {
            System.out.print(arr1[j]+"\t");
        }
        sc.close();

    }
}
