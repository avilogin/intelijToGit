package src.SeptPractice.Collection.List.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class AddingInBetween {
    public static void main(String[] args) {
        List<String> l1 = new LinkedList<>();
        l1.add("AAAAAA");
        l1.add("BBBBB");
        l1.add("EEEEEE");
        System.out.println(l1);
        List<String> l2 = new LinkedList<>();
        l2.add("CCCCC");
        l2.add("DDDDD");
        System.out.println(l2);

        l1.addAll(2,l2);
        System.out.println(l1);





    }
}
