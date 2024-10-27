package src.SeptPractice.Collection.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class SetToArray {
    public static void main(String[] args) {
        Set<String> h  = new HashSet<>();
        h.add("First");
        h.add("Second");
        h.add("Third");
        h.add("Forth");
        System.out.println(h);

        String ar[] =  new String[h.size()];
        h.toArray(ar);
        for (String s :ar)
        {
            System.out.println(s);
        }



    }
}
