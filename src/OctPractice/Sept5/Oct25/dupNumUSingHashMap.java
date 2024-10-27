package src.OctPractice.Sept5.Oct25;

import java.util.HashMap;
import java.util.Map;

public class dupNumUSingHashMap {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5,66,33,44,55,22,44,77,5,9,2,5,7,88,22,7,7,44,77};

        Map<Integer, Integer> map =  new HashMap<>();
        for (int el : arr)
        {
            if(map.containsKey(el))
            {
                map.put(el,map.get(el)+1);
            }
            else
            {
                map.put(el,1);
            }
        }
        for (int dup : map.keySet())
        {
            if (map.get(dup)>1)
            {
                System.out.println(dup+" is duplicate");
            }
        }

    }
}
