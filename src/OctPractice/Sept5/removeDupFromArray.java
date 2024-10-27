package src.OctPractice.Sept5;

import java.util.HashSet;
import java.util.Set;

public class removeDupFromArray {
    public static void main(String[] args) {
        int arr[] = {1,4,2,3,5,1,2,5,7,3,2,4};

        Set s =  new HashSet();
        for (int i =0;i<arr.length;i++)
        {
            s.add(arr[i]);
        }
        System.out.println(s);

    }
}
