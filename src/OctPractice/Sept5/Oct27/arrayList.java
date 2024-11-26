package src.OctPractice.Sept5.Oct27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class arrayList {
    public static void main(String[] args) {
        List l =  new ArrayList();
        l.add("Black");
        l.add("White");
        l.add("blue");
        l.add("gray");
        l.add("green");

        //Iterator
        Iterator i = l.iterator();

        while (i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println();
        //list Iterator
        ListIterator<String> s = l.listIterator(l.size());
        while (s.hasPrevious())
        {
            System.out.print(s.previous()+"\t");
        }


    }
}
