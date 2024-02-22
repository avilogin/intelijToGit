package src.Before2302;

import java.util.Arrays;

public class Print2DArray02 {

    //Using for loop
    public static void main(String[] args) {

        int arr1[][] = new int[3][3];
        arr1[0][0] = 11;
        arr1[0][1] = 12;
        arr1[0][2] = 13;

        arr1[1][0] = 14;
        arr1[1][1] = 15;
        arr1[1][2] = 16;

        arr1[2][0] = 17;
        arr1[2][1] = 18;
        arr1[2][2] = 19;

        for (int i=0;i<arr1.length;i++)
        {
            for (int j =0;j<arr1[i].length;j++)
            {
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println("");


        }


    }
}
