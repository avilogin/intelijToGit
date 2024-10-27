package src.SeptPractice.sept18;
import java.util.Arrays;
import java.util.List;

public class containString {
    public static void main(String[] args) {
        String main_str = "hi i am the good Boy and boy";
        String[] final_str = main_str.split(" ");
        String search = "boy";

        List<String> li = Arrays.asList(final_str);

       boolean result =  li.contains(search);
       if (result)
           System.out.println(search+" is Found");
       else
           System.out.println(search+" is Not Found");
    }
}
