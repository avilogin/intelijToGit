package src.SeptPractice.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add(1);
        l1.add(2);
        l1.add(0);
        l1.add(4);
        l1.add(5);


        //Iterator example

        Iterator it =  l1.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("Forward Iteration");

        //ListIterator

        ListIterator li = l1.listIterator();

        while(li.hasNext())
        {

            System.out.println(li.next());
        }
        System.out.println("Backword Iteration");

        while(li.hasPrevious())
        {

            System.out.println(li.previous());
        }
    }
}
