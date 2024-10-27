package src.SeptPractice.Collection.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMap {
    public static void main(String[] args) {
        Map<Integer, String> m =  new LinkedHashMap<>();
        m.put(1,"aaaaaa");
        m.put(2,"bbbbbb");
        m.put(3,"ccccc");
        m.put(4,"dddddd");
        m.put(5,"eeeeee");

        for (Integer i : m.keySet())
        {
            System.out.println("Key "+i+" -- Value "+m.get(i));
        }
        System.out.println("-------Entry Set-------");

        for (Map.Entry<Integer,String> en : m.entrySet() )
        {
            System.out.println("Key "+en.getKey()+" Value "+en.getValue());
        }

    }
}
