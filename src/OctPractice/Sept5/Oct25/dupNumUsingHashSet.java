package src.OctPractice.Sept5.Oct25;

import java.util.HashSet;
import java.util.Set;

public class dupNumUsingHashSet {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5,66,33,44,55,22,44,77,5,9,2,5,7,88,22,7,7,44,77};

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> dup = new HashSet<>();

        for (int c : arr)
        {
            if(!s1.add(c))
            {
                if(!dup.contains(c))
                {
                    System.out.println("Duplicate is "+c);
                    dup.add(c);
                }
            }
        }
    }
}
