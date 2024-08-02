package src.ArrayPrograms;

import java.util.Scanner;

public class StringToCharacterArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a String");
        String st = sc.next();
        char[] arr = st.toCharArray();
        for (char ch : arr)
        {
            System.out.print(ch+" ");
        }
    }
}
