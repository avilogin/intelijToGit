package src.Practice;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicate {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 40, 40, 40, 50, 50};

        Set num = new HashSet();
        for (int i =0;i<arr.length;i++)
        {
            num.add(arr[i]);
        }
        System.out.println(num);

    }
}
