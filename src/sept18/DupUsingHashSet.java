package src.sept18;
import java.util.Set;
import java.util.HashSet;

public class DupUsingHashSet {
    public static void main(String[] args) {
        int ar[] = new int[] {1, 2, 3, 4, 5,66,33,44,55,22,44,77,5,9,2,5,7,88,22};
        Set s = new HashSet();
        Set dup =  new HashSet();

        for (Integer i : ar)
        {
            if (!s.add(i))
            {
                if (!dup.contains(i))
                {
                    System.out.println("Duplicate is "+i);
                    dup.add(i);
                }
            }
        }
    }
}
