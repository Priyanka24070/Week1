import java.util.Scanner;

public class WordLengthAnalysis {

    // Method to split the text into words without using the split() method
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

    // Method to find the shortest and longest words in a 2D array of words and lengths
    public static String[] findShortestAndLongest(String[][] wordLengthArray) {
        String shortestWord = wordLengthArray[0][0];
        String longestWord = wordLengthArray[0][0];
        int shortestLength = Integer.parseInt(wordLengthArray[0][1]);
        int longestLength = Integer.parseInt(wordLengthArray[0][1]);

        for (String[] wordLength : wordLengthArray) {
            int currentLength = Integer.parseInt(wordLength[1]);
            if (currentLength < shortestLength) {
                shortestWord = wordLength[0];
                shortestLength = currentLength;
            }
            if (currentLength > longestLength) {
                longestWord = wordLength[0];
                longestLength = currentLength;
            }
        }

        return new String[]{shortestWord, longestWord};
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

        // Find the shortest and longest words
        String[] shortestAndLongest = findShortestAndLongest(wordLengthArray);

        // Display the results
        System.out.println("\nShortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);

        // Close the scanner
        scanner.close();
    }
}
