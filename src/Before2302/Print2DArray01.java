package src.Before2302;

import java.util.Arrays;

public class Print2DArray01 {
    public static void main(String[] args) {

        //Using toString method
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
        System.out.println(arr1.length);

        for (int i=0;i<arr1.length;i++)
        {
            System.out.println(Arrays.toString(arr1[i]));
        }


    }
}
