import java.util.Scanner;

public class CharacterFrequency1 {

    // Method to find unique characters in a string using charAt() method
    public static char[] uniqueCharacters(String text) {
        int[] freq = new int[256];  // Frequency array for characters (256 for ASCII characters)
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Count the number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Create an array to store the unique characters
        char[] uniqueChars = new char[uniqueCount];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueChars[index] = (char) i;
                index++;
            }
        }

        return uniqueChars;
    }

    // Method to find the frequency of characters and store them in a 2D array
    public static String[][] findCharacterFrequency(String text) {
        int[] freq = new int[256];  // Frequency array for characters (256 for ASCII characters)

        // Loop through the text to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Get the unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Create a 2D array to store the unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        // Loop through unique characters and store them in the 2D array
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);  // Character as a string
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);  // Frequency as a string
        }

        return result;
    }

    // Method to display the 2D array (characters and their frequencies)
    public static void displayFrequency(String[][] frequencyArray) {
        System.out.println("Character\tFrequency");
        for (int i = 0; i < frequencyArray.length; i++) {
            System.out.println(frequencyArray[i][0] + "\t\t" + frequencyArray[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find the character frequency
        String[][] frequencyResult = findCharacterFrequency(text);

        // Display the result
        displayFrequency(frequencyResult);
    }
}
