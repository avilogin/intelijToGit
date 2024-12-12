package src.DecPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestNumberInArray {
    public static void main(String[] args) {
        Integer arr [] = {10, 20, 5, 15, 30, 25};
        List<Integer> arrList = Arrays.asList(arr);

        Collections.sort(arrList); //sort in ascending order
        System.out.println(arrList);
        Collections.reverse(arrList);//reversing array
        System.out.println(arrList);
        System.out.println("Second highest is "+arrList.get(1));


    }
}
