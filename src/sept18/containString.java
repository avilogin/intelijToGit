package src.sept18;
import java.util.Arrays;
import java.util.List;

public class containString {
    public static void main(String[] args) {
        String[] sat = {"hi","i","am","the","good","Boy"};

        List<String> li = Arrays.asList(sat);

       boolean result =  li.contains("goood");
       if (result)
           System.out.println("Found");
       else
           System.out.println("Not Found");
    }
}
