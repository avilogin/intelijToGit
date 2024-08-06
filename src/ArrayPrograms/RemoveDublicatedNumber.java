package src.ArrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDublicatedNumber {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 40, 40, 40, 50, 50,66,99,88,55,22,33,44,11,44,55,66,99,88,22,33};
        int n = arr.length;
        Set hash_set = new HashSet();
        for (int i = 0; i<n; i++)
        {
            hash_set.add(arr[i]);

        }
        System.out.println(hash_set);
    }
}
