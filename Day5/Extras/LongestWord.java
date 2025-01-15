import java.util.Scanner;

public class LongestWord {

    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Initialize variables to store the longest word and its length
        String longestWord = "";
        int maxLength = 0;

        // Loop through the words to find the longest one
        for (String word : words) {
            // Check if the current word is longer than the longest one found so far
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }

        return longestWord;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept a sentence from the user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Call the method to find the longest word
        String longestWord = findLongestWord(sentence);

        // Display the result
        System.out.println("The longest word is: " + longestWord);

        scanner.close();
    }
}
