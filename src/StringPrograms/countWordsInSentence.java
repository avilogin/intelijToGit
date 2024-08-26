package src.StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class countWordsInSentence {
    public static void main(String[] args) {
        String main = "Hi my name is avijeet and avijeet is my name";
        String[] str_arr = main.split(" ");

        Map<String, Integer> map = new HashMap();

        for (String o: str_arr)
        {
            Integer count = map.get(o);
            if(count== null)
            {
                map.put(o,1);
            }
            else
            {
                map.put(o,count+1);
            }
        }
        for (String w : map.keySet())
        {
            System.out.println(w +" is present "+map.get(w)+" times");
        }

    }
}
