package src.OctPractice.Sept5.Oct23;

import java.util.HashMap;
import java.util.Map;

public class dupHashMap {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5,66,33,44,55,22,44,77,5,9,2,5,7,88,22,7,7};
        Map<Integer, Integer> map1 = new HashMap<>();

        for (int c1 : arr)
        {
            if (map1.containsKey(c1))
            {
                map1.put(c1,map1.get(c1)+1);
            }
            else
            {
                map1.put(c1,1);
            }
        }
        for(int c2: map1.keySet())
        {
            if(map1.get(c2)>1)
            {
                System.out.println("Duplicate is "+c2);
            }
        }
    }
}
