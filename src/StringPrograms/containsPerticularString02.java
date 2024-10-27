package src.StringPrograms;

import java.util.Arrays;
import java.util.List;

public class containsPerticularString02 {
    public static void main(String[] args) {
        String main_str = "hello how do you do my name is avijeet";
        String str_arr[] = main_str.split(" ");
        String find = "name";

        List<String> arr_list =Arrays.asList(str_arr);

        boolean result = arr_list.contains(find);
        if (result)
        {
            System.out.println("'"+find+"'"+" is found in the string");
        }
        else
        {
            System.out.println("'"+find+"'"+" is not found in the string");
        }
    }
}
