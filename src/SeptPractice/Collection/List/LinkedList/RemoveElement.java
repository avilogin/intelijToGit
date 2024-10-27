package src.SeptPractice.Collection.List.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList();
        String word = "Bima";
        s.add("Avijeet");
        s.add("Zima");
        s.add("Cima");
        s.add("Bima");
        s.add("Pima");
        s.add("Bima");
        System.out.println(s);
        for (int i =0;i<s.size();i++)
        {
            if (s.get(i).equalsIgnoreCase(word))
            {
                s.remove(i);
            }
        }
        System.out.println(s);
    }
}
