package src.Practice;

import java.util.HashMap;

public class charInarray02 {
    public static void main(String[] args) {
        String str = "avijeetJanamob";
        HashMap<Character,Integer> hash = new HashMap<>();
        char[] ch = str.toCharArray();
        for(Character c :ch)
        {
            if(hash.containsKey(c))
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
