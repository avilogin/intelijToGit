package src.OctPractice.Sept5.Oct26;

import java.util.HashMap;
import java.util.Map;

public class freqUsingHashMap {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 6, 5, 4, 1, 2, 0};
        Map<Integer, Integer> m1 = new HashMap<>();

        for (int i : arr)
        {
            if (m1.containsKey(i))
            {
                m1.put(i,m1.get(i)+1);
            }
            else
            {
                m1.put(i,1);
            }
        }
        for (int j : m1.keySet())
        {

            System.out.println(j+"-------"+m1.get(j));
        }
    }
}
