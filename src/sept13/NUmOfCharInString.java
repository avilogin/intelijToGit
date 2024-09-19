package src.sept13;

import java.util.HashMap;
import java.util.Scanner;

public class NUmOfCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide String");
        String st = sc.next();
        char charSt[] = st.toCharArray();

        HashMap<Character, Integer> map =  new HashMap<>();

        for (Character ch : charSt)
        {
            if (map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }

        for (Character c : map.keySet())
        {

            System.out.println("The character "+c+ " is repeated "+map.get(c)+" times");

        }

    }
}
