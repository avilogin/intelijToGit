package src.BasicPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharUsingHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a String");
        String string = sc.next();
        char[] charArr = string.toCharArray();
        Map<Character,Integer> mainMap = new HashMap<Character,Integer>();

        for (Character ch : charArr)
        {
            if (mainMap.containsKey(ch))
            {
                mainMap.put(ch, mainMap.get(ch)+1);
            }
            else
            {
                mainMap.put(ch,1);
            }

        }

        for (Character ch :mainMap.keySet())
        {
            if (mainMap.get(ch)>1)
            {
                System.out.println("Character "+ch+ " is repeated "+mainMap.get(ch)+" times");
            }
        }
    }

}
