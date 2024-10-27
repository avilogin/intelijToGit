package src.SeptPractice.Collection.List.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class AddingInArray {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("Avijeet");
        l.add(22);
        l.add(false);
        l.add(true);
        System.out.print(l+"\t");
        System.out.println();

        Iterator i = l.iterator();

        while (i.hasNext())
        {
            System.out.println(i.next());
            if (i.next().equals(true))
            {
                i.remove();
            }
        }
        l.add(1,"Jana");

        System.out.println("------------------");
        for (Object o : l)
        {
            System.out.println(o);
        }

    }
}
