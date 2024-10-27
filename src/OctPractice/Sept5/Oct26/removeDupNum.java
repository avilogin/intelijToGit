package src.OctPractice.Sept5.Oct26;

import java.util.HashSet;
import java.util.Set;

public class removeDupNum {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 40, 40, 40, 50, 50,66,99,88,55,22,33,44,11,44,55,66,99,88,22,33};
        Set s =  new HashSet();
        for (int i =0;i<arr.length;i++)
        {
            s.add(arr[i]);
        }
        System.out.println(s);
    }
}
