package src.ArrayPrograms;

import java.util.Arrays;

public class SortingCharactersInArray {
    public static void main(String[] args) {
        char [] arr = {'z','r','s','t','p','r','a','s','a'};

        System.out.println("Characters in array are : ");
        for (int i = 0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Sorted characters in array are : ");
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
