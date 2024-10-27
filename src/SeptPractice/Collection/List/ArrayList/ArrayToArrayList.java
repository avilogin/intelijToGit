package src.SeptPractice.Collection.List.ArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String ar [] = {"I","am", "a","good","boy"};
        //printing array
        for (String s : ar)
        {
            System.out.print(s +"\t");
        }
        //array to arrayList

        List<String> li = Arrays.asList(ar);
        Iterator i = li.iterator();
        System.out.println();
        while (i.hasNext())
        {
            System.out.print(i.next()+"\t");
        }
    }
}
