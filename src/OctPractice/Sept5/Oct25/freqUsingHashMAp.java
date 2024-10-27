package src.OctPractice.Sept5.Oct25;

import java.util.HashMap;
import java.util.Map;

public class freqUsingHashMAp {
    public static void main(String[] args) {
        int [] arr = new int [] {1,2,3,4,5,6,6,5,4,1,2,3,0};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr)
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
        for (int j : map.keySet())
        {
            System.out.println(j + " is present "+map.get(j)+" times");
        }
    }
}
