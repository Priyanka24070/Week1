import java.util.Scanner;

public class SplitTextComparison {

    // Method to split the text into words using charAt() and without using the split() method
    public static String[] splitTextWithoutSplitMethod(String str) {
        // Count the number of words by counting spaces
        int wordCount = 1; // There's at least one word in the string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }
        
        // Create an array to store the word indexes
        int[] spaceIndexes = new int[wordCount - 1];
        int spaceCount = 0;

        // Store the indexes of spaces
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[spaceCount++] = i;
            }
        }

        // Create an array to store the words
        String[] words = new String[wordCount];
        int startIndex = 0;
        int wordIndex = 0;

        // Extract words using the space indexes
        for (int i = 0; i < spaceIndexes.length; i++) {
            words[wordIndex++] = str.substring(startIndex, spaceIndexes[i]);
            startIndex = spaceIndexes[i] + 1; // Move to the next word after the space
        }
        
        // Add the last word after the last space
        words[wordIndex] = str.substring(startIndex);

        return words;
    }

    // Method to compare two string arrays and return a boolean result
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Take the input text from the user
        System.out.print("Enter a sentence: ");
        String inputText = scanner.nextLine();

        // Call the user-defined method to split the text into words
        String[] wordsWithoutSplit = splitTextWithoutSplitMethod(inputText);

        // Call the built-in split() method to split the text into words
        String[] wordsWithSplit = inputText.split(" ");

        // Compare the two arrays and display the result
        boolean areEqual = compareStringArrays(wordsWithoutSplit, wordsWithSplit);

        // Display the results
        System.out.println("Words using user-defined method: ");
        for (String word : wordsWithoutSplit) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split() method: ");
        for (String word : wordsWithSplit) {
            System.out.println(word);
        }

        // Display comparison result
        if (areEqual) {
            System.out.println("\nBoth methods produce the same result.");
        } else {
            System.out.println("\nThe results are different.");
        }

        // Close the scanner
        scanner.close();
    }
}
