package src.ArrayPrograms;

import java.util.*;

public class removeDuplicatesUsingFor {
    public static void main(String[] args) {
        List <String> li =  new ArrayList<>();
        li.add("Apple");
        li.add("Banana");
        li.add("Cherry");
        li.add("Apple");
        li.add("Banana");
        System.out.print(li+"\t");
        System.out.println();

        List<String> uni = new ArrayList<>();

        for (String s : li)
        {
            if (!uni.contains(s))
            {
               uni.add(s);
            }
        }
        System.out.print(uni+"\t");
    }
}
