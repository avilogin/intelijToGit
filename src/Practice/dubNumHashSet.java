package src.Practice;

import java.util.HashSet;
import java.util.Set;

public class dubNumHashSet {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9};

        Set<Integer> hash = new HashSet();
        for (int i : arr)
        {
            if (!hash.add(i))
            {
                System.out.println("Duplicate number is "+i);
            }
        }

    }
}
