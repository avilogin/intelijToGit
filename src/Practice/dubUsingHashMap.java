package src.Practice;

import java.util.HashMap;
import java.util.Map;

public class dubUsingHashMap {
    public static void main(String[] args) {
        int arr[]  = {2,1,3,4,6,2,5,4,6,7,3,1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i =0;i<arr.length;i++)
        {
            if (map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }

        for (Integer i :map.keySet())
        {
            if (map.get(i)>1)
            {
                System.out.println("Duplicate number is "+i);
            }
        }
    }
}
