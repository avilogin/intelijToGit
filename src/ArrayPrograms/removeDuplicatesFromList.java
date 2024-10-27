package src.ArrayPrograms;

import java.util.*;

public class removeDuplicatesFromList {
    public static void main(String[] args) {
        List <String> li =  new ArrayList<>();
        li.add("Apple");
        li.add("Banana");
        li.add("Cherry");
        li.add("Apple");
        li.add("Banana");
        System.out.print(li+"\t");
        System.out.println();
        Set<String> s = new LinkedHashSet<>(li);
        List<String> un = new ArrayList<>(s);

        Iterator i =  un.iterator();
        while (i.hasNext())
        {
            System.out.print(i.next()+"\t");
        }
    }
}
