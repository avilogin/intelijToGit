package src.StringPrograms;

import java.util.Scanner;

public class DuplicateCharInString {
    public static void main(String[] args) {
        String input = "programming";
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Count occurrences of each character
        for (char c : input.toCharArray()) {
            charCount[c]++;
        }

        System.out.println("Duplicate characters:");
        // Print characters that appear more than once
        for (char c = 0; c < charCount.length; c++)
        {
            if (charCount[c] > 1) {
                System.out.println(c + ": " + charCount[c] + " times");
            }
        }


    }

}
