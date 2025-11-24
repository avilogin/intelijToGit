package src.PracticeJava;

import java.util.HashMap;
import java.util.Map;

public class FrequencyUsingHashMap {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8};

        Map<Integer,Integer> map = new HashMap<>();

        for(Integer i : arr)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else
            {
                map.put(i,1);
            }
        }

        for (Integer j : map.keySet())
        {
            System.out.println(j+"--"+map.get(j));
        }

    }
}
