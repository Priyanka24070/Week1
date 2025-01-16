import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if lengths of the strings are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Convert the strings to lowercase and remove spaces for case-insensitive comparison
        text1 = text1.replaceAll("\\s", "").toLowerCase();
        text2 = text2.replaceAll("\\s", "").toLowerCase();

        // Create arrays to store the frequency of characters in both texts
        int[] charFrequency1 = new int[256]; // For all possible ASCII characters
        int[] charFrequency2 = new int[256];

        // Calculate the frequency of characters in the first string
        for (int i = 0; i < text1.length(); i++) {
            charFrequency1[text1.charAt(i)]++;
        }

        // Calculate the frequency of characters in the second string
        for (int i = 0; i < text2.length(); i++) {
            charFrequency2[text2.charAt(i)]++;
        }

        // Compare the frequency arrays
        for (int i = 0; i < 256; i++) {
            if (charFrequency1[i] != charFrequency2[i]) {
                return false; // If frequencies do not match, it's not an anagram
            }
        }

        return true; // If frequencies match, the texts are anagrams
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for both texts
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Check if the texts are anagrams
        if (areAnagrams(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        scanner.close();
    }
}
