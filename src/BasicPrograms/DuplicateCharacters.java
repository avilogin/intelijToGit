package src.BasicPrograms;

import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a String");
        String string = sc.next();
        int count= 0;
        //Changing string to character Array
        char[] charArr = string.toCharArray();
        for (int i=0;i<charArr.length;i++)
        {
            for (int j = i+1;j<charArr.length;j++)
            {
                if (charArr[i]==charArr[j])
                {
                    System.out.println("Duplicate character is "+charArr[j]);
                    count++;
                }
            }

        }
        System.out.println("Count of Duplicate characters are "+count);
    }

}
