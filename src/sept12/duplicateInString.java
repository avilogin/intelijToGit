package src.sept12;

import java.util.Scanner;

public class duplicateInString {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Taking input from user
            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            // Close scanner
            sc.close();

            // Convert input string to lowercase to handle case-insensitivity (optional)
            input = input.toLowerCase();

            // Array to store the count of each character
            int[] countArray = new int[256]; // ASCII has 256 characters

            // Count the frequency of each character in the input string
            for (int i = 0; i < input.length(); i++) {
                countArray[input.charAt(i)]++;
            }

            System.out.println("Duplicate characters in the string are:");

            // Print duplicate characters
            for (int i = 0; i < 256; i++) {
                if (countArray[i] > 1) {
                    System.out.println((char) i + " : " + countArray[i]);
                }
            }
        }
    }

