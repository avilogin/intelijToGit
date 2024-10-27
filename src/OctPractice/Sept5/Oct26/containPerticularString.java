package src.OctPractice.Sept5.Oct26;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;


public class containPerticularString {
    public static void main(String[] args) {
        String main_str = "Hello madam How do you do";
        String lower_str = main_str.toLowerCase();
        String str_arr[] = lower_str.split(" ");

        Scanner sc =  new Scanner(System.in);
        System.out.println("Provide the string to find");
        String find = sc.next();

        List<String> list_str = Arrays.asList(str_arr);

        if (list_str.contains(find))
        {
            System.out.println("'"+find+"'"+" is found in the string");
        }
        else
        {
            System.out.println("'"+find+"'"+" is not found in the string");
        }
    }
}
