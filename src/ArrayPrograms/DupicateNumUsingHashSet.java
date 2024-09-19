package src.ArrayPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DupicateNumUsingHashSet {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5,66,33,44,55,22,44,77,5,9,2,5,7,88,22};


        Set<Integer> hs = new HashSet<Integer>();

        for(Integer el : arr)
        {
            if(!hs.add(el))
            {
                System.out.println("Duplicate Element is "+el);
            }
        }

    }

}
