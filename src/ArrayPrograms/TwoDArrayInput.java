package src.ArrayPrograms;

import java.util.Scanner;

public class TwoDArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a row Number");
        int row = sc.nextInt();
        System.out.println("Provide a column Number");
        int col = sc.nextInt();
        int [][] arr = new int[row][col];

        //Adding elements in array
        System.out.println("Enter the elements of the array: ");
        for (int i =0; i<row;i++)
        {
            for (int j = 0;j<col;j++)
            {
                arr[i][j] = sc.nextInt();
            }

        }

        System.out.println("Elements in array are : ");
        //Printing elements
        for (int i =0; i<row;i++)
        {
            for (int j = 0;j<col;j++)
            {
                System.out.print(arr[i][j]+"\t");

            }
            System.out.println();

        }

    }
}
