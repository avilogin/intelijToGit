package src.SeptPractice.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class compareArray {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(0);
        l1.add(4);
        l1.add(5);
        for (Integer i : l1)
        {
            System.out.print(i+"\t");
        }
        System.out.println();
        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(9);
        l2.add(5);
        for (Integer j : l2)
        {
            System.out.print(j+"\t");
        }
        List l3 =new ArrayList<>();
        System.out.println();
        for (Integer k : l1)
        {
            l3.add(l2.contains(k)? "Match":"Not Match");
        }
        System.out.println(l3);

    }
}
