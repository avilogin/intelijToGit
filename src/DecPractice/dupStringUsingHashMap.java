package src.DecPractice;

import java.util.HashMap;
import java.util.Map;

public class dupStringUsingHashMap {
    public static void main(String[] args) {
        String str = "Programming";
        char arr[] = str.toCharArray();

        Map<Character,Integer> m = new HashMap<>();

        for (Character c : arr)
        {
            if (m.containsKey(c))
            {
                m.put(c,m.get(c)+1);
            }
            else
            {
                m.put(c,1);
            }
        }

        for (Character ch : m.keySet())
        {
            if (m.get(ch)>1)
            {
                System.out.println(ch + " is present "+m.get(ch)+" times");
            }
        }
    }
}
