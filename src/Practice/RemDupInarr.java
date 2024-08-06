package src.Practice;

import java.util.HashSet;
import java.util.Set;

public class RemDupInarr {
    public static void main(String[] args) {
        int arr[] = {10,10,20,20,30,30,40,40,50,50,60,60,70,80,90,80,70};
        Set hash = new HashSet();
        for(int i = 0;i<arr.length;i++)
        {
            hash.add(arr[i]);
        }
        System.out.print(hash +" ");
    }
}
