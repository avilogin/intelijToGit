package src.StringPrograms;

import java.util.Arrays;
import java.util.List;

public class containsPerticularString {
    public static void main(String[] args) {

        String[] sat = {"hi","i","am","the","good","Boy"};

        List<String> ss = Arrays.asList(sat);
        Boolean value =  ss.contains("good");
        if (value)
        {
            System.out.println("String is present");
        }
        else
        {
            System.out.println("String is not Present");
        }
    }
}
