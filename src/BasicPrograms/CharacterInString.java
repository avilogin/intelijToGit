package src.BasicPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterInString {
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

        System.out.println(hash_map);
    }
}
