package src.ArrayPrograms;

import java.util.HashMap;

public class DuplicateIntegerUsingHashMap {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5,66,33,88,55,22,44,77,5,9,2,5,7,88,22};
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for(int ch : arr)
        {
            if (hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)+1);
            }
            else
            {
                hm.put(ch,1);
            }
        }
        for (Integer cr :hm.keySet())
        {
            if (hm.get(cr)>1)
            {
                System.out.println("Duplicate Number is "+cr);
            }
        }
    }
}
