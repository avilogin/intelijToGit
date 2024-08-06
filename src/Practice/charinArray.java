package src.Practice;

import java.util.HashMap;
import java.util.Scanner;

public class charinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a String");
        String str = sc.next();
        HashMap<Character, Integer> hash = new HashMap<>();

        char[] ch = str.toCharArray();
        for (Character c :ch)
        {
            if (hash.containsKey(c))
            {
                hash.put(c,hash.get(c)+1);
            }
            else
            {
                hash.put(c,1);
            }

        }
        System.out.println(hash);



    }
}
