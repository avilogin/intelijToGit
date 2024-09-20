package src.ArrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbersInArray {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5,66,33,88,55,22,44,77,5,9,2,5,7,88,22};
        Set<Integer> s = new HashSet();
        System.out.println("Duplicate elements in given array: ");

        for(int i =0;i<arr.length;i++)
        {
            for (int j = i+1; j<arr.length;j++)
            {
                if (arr[i]==arr[j]&& !s.contains(arr[i]))
                {
                    System.out.println(arr[i]);
                    s.add(arr[i]); // Add the element to set after printing

                }
            }
        }

    }
}
