package src.OctPractice.Sept5.Oct26;
import java .util.Map;
import java.util.HashMap;

public class dupCharUsingHashMap {
    public static void main(String[] args) {
        String str  = "Automation";
        String str_low = str.toLowerCase();
        char char_arr[] = str_low.toCharArray();

        Map<Character, Integer> m = new HashMap();

        for (char c : char_arr)

        {
            if(m.containsKey(c))
            {
                m.put(c,m.get(c)+1);
            }
            else
            {
                m.put(c,1);
            }
        }
        for(char c : m.keySet())
        {
            if (m.get(c)>1)
            {
                System.out.println(c +" is present "+m.get(c)+" times");
            }
        }


    }
}
