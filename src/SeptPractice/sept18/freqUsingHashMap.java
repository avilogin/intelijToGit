package src.SeptPractice.sept18;

import java.util.HashMap;
import java.util.Map;

public class freqUsingHashMap {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1,2,3,4,5,6,7,8,8};

        Map<Integer, Integer> m = new HashMap<>();
        for (Integer i : arr )
        {
            if (m.containsKey(i))
            {
                m.put(i, m.get(i)+1);
            }
            else
            {
                m.put(i,1);
            }
        }
        for (Integer di : m.keySet())
        {
            System.out.println(di+" is apearing "+m.get(di)+" times");
        }
    }
}
