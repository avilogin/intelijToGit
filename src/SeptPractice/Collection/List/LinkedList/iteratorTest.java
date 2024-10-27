package src.SeptPractice.Collection.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class iteratorTest {
    public static void main(String[] args) {
        List<String> l =  new LinkedList<>();
        l.add("Black");
        l.add("White");
        l.add("blue");
        l.add("gray");
        l.add("green");

        Iterator<String> i  =  l.iterator();
        while (i.hasNext())
        {
            String el = i.next();
            if (el.equals("blue"))
            {
                i.remove();
            }


        }
        for (String s : l)
        {
            System.out.print(s+"\t");
        }
    }
}
