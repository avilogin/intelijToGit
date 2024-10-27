package src.SeptPractice.sept18;

import java.util.LinkedHashMap;
import java.util.Map;

public class DupCharUsingHashMap {
    public static void main(String[] args) {
        String s = "avijeietai";
        char ar[] = s.toCharArray();

        Map<Character, Integer> m = new LinkedHashMap<>();

        for (Character c : ar)
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
                System.out.println(ch +" is present "+m.get(ch)+" times");
            }
        }
    }

}
