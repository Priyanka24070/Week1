import java.util.Scanner;

public class SplitTextWithLengths {

    // Method to split the text into words using charAt() without using split() method
    public static String[] splitTextWithoutSplitMethod(String str) {
        int wordCount = 1; // Start with one word
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int startIndex = 0;
        int wordIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                words[wordIndex++] = str.substring(startIndex, i);
                startIndex = i + 1;
            }
        }

        // Add the last word
        words[wordIndex] = str.substring(startIndex);
        return words;
    }

    // Method to find and return the length of a string without using the length() method
    public static int findLengthWithoutLengthMethod(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Stop counting when an exception is thrown
        }
        return count;
    }

    // Method to create a 2D array with words and their lengths
    public static String[][] createWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Store the word
            result[i][1] = String.valueOf(findLengthWithoutLengthMethod(words[i])); // Store its length as a string
        }

        return result;
    }

    public static void main(String[] args) {
        // Create Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Take the input text from the user
        System.out.print("Enter a sentence: ");
        String inputText = scanner.nextLine();

        // Split the text into words using the user-defined method
        String[] words = splitTextWithoutSplitMethod(inputText);

        // Create the 2D array with words and their lengths
        String[][] wordLengthArray = createWordLengthArray(words);

        // Display the result in a tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("--------------------");
        for (String[] wordLength : wordLengthArray) {
            System.out.println(wordLength[0] + "\t\t" + Integer.parseInt(wordLength[1]));
        }

        // Close the scanner
        scanner.close();
    }
}
