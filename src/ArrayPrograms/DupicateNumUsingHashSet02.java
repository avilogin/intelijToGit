package src.ArrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class DupicateNumUsingHashSet02 {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5,66,33,44,55,22,44,77,5,9,2,5,7,88,22,7,7};


        Set<Integer> hs = new HashSet<Integer>();
        Set<Integer> dup = new HashSet();

        for(Integer el : arr)
        {
            if(!hs.add(el))
            {
                if(!dup.contains(el))
                {
                    System.out.println("Duplicate is "+el);
                    dup.add(el);
                }
            }
        }

    }

}
