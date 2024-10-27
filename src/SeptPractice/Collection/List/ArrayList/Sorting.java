package src.SeptPractice.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(2);
        li.add(67);
        li.add(33);
        li.add(78);
        li.add(56);
        li.add(1);
        li.add(99);

        for (Integer i : li)
        {
            System.out.print(i+"\t");
        }
        System.out.println();
        //sorting using Collections class
        Collections.sort(li);
        Iterator it = li.iterator();
        while (it.hasNext())
        {
            System.out.print(it.next()+"\t");
        }
        System.out.println();
        Collections.reverse(li);
        Iterator itt = li.iterator();
        while (itt.hasNext())
        {
            System.out.print(itt.next()+"\t");
        }

    }
}
