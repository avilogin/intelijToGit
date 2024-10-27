package src.StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountWordsInSentence02 {
    public static void main(String[] args) {
        String main = "Hi my name is avijeet and avijeet is my name hi";
        String low_main = main.toLowerCase();
        String main_arr[] = low_main.split(" ");

        Map<String, Integer> m = new HashMap<>();

        for (String s : main_arr)
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
        for (String c : m.keySet())
        {
            System.out.println("'"+c+"'"+" is present "+m.get(c)+" times");
        }
    }
}
