package src.StringPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class NoOfCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a String: ");
        String str = sc.next();
        HashMap<Character, Integer> hash_map = new HashMap<>();
        char[] strArray = str.toCharArray();

        for (char c : strArray) {
            if (hash_map.containsKey(c)) {
                hash_map.put(c, hash_map.get(c) + 1);
            }
            else {
                hash_map.put(c, 1);
            }
        }

        for(Character ch : hash_map.keySet())
        {
            System.out.println(ch + " is repeated "+hash_map.get(ch)+" times");
        }
    }
}
