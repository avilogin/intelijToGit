package src.sept12;

import java.util.Scanner;

public class DupChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert input string to lowercase to handle case-insensitivity (optional)
        input = input.toLowerCase();

        // Convert the string to a char array
        char[] charArray = input.toCharArray();


        System.out.println("Duplicate characters in the string are:");

        // Outer loop goes through each character
        for (int i = 0; i <charArray.length; i++) {
            // Skip already visited characters (when comparing a character with itself)
            if (charArray[i] == '0')
                continue;

            int count = 1;  // Initialize count for the current character

            // Inner loop compares the current character with the rest of the string
            for (int j = i + 1; j <charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    count++;
                    // Mark this character as counted by setting it to '0'
                    charArray[j] = '0';
                }
            }

            // If a character appears more than once, print it
            if (count > 1) {
                System.out.println(charArray[i] + " : " + count);
            }
        }
    }
}
