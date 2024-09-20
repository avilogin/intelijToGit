package src.sept18;

import java.util.LinkedHashMap;
import java.util.Map;

public class countWordInString {
    public static void main(String[] args) {
        String main = "Hi my name is avijeet and avijeet is my name hello";
        String arr[] = main.split(" ");

        Map<String, Integer> m = new LinkedHashMap<>();

        for (String s : arr)
        {
            if (m.containsKey(s))
            {
                m.put(s,m.get(s)+1);
            }
            else
            {
                m.put(s,1);
            }
        }

        for (String el : m.keySet())
        {
            System.out.println(el +" is present "+m.get(el)+" times");
        }
    }
}
