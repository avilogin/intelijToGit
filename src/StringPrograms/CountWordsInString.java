package src.StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountWordsInString {
    public static void main(String[] args) {
        String str = "boy good like made good girl boy like";
       String[] strArr = str.split(" ");

        Map<String,Integer> map = new HashMap<String,Integer>();
        int count =1;
       for (int i =0; i<strArr.length;i++)
       {
           if(map.containsKey(strArr[i]))
           {
               map.put(strArr[i],map.get(strArr[i])+1);
           }
           else
           {
               map.put(strArr[i],count);
           }
       }
       for (String st : map.keySet())
       {
           System.out.println(" ' "+st+ " ' "+" in string is "+map.get(st)+" times");
       }

    }
}
