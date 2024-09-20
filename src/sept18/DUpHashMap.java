package src.sept18;

import java.util.HashMap;
import java.util.Map;

public class DUpHashMap {
    public static void main(String[] args) {
        int arr[]  = {1,2,6,2,5,4,6,7,3,1};
        Map<Integer,Integer> m = new HashMap();

        for (Integer i : arr)
        {
            if (m.containsKey(i))
            {
                m.put(i,m.get(i)+1);
            }
            else
            {
                m.put(i,1);
            }
        }

        for (Integer ch : m.keySet())
        {
            if (m.get(ch)>1)
            {
                System.out.println(ch +" is Duplicate");
            }
        }

    }
}
