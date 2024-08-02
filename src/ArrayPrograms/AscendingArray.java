package src.ArrayPrograms;

import java.util.Scanner;

public class AscendingArray {
    public static void main(String[] args) {
        int temp = 0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Provide the number of elements to store");
        int num = sc.nextInt();

        //creating array of size num
        int arr[] = new int[num];
        System.out.println("Enter the elements of the array: ");

        //for storing the data in array
        for (int i = 0;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Elements in array are: ");

        //for Printing the array
        for (int i =0; i<num;i++)
        {
            System.out.print(arr[i]+" ");
        }

        //for sorting the array
        for(int i =0;i<num;i++)
        {
            for (int j = i+1;j<num;j++)
            {
                if (arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }
            }
        }

        System.out.println();
        System.out.println("Elements of array sorted in ascending order: ");
        //for displaying the sorted array
        //for Printing the array
        for (int i =0; i<num;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
