import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of characters (ASCII range)

        // Loop to calculate the frequency of each character in the string
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Create a 2D array to store the characters and their frequencies
        int uniqueCharCount = 0;

        // Count the number of unique characters
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCharCount++;
            }
        }

        // Initialize the 2D array to store the character and frequency pairs
        String[][] result = new String[uniqueCharCount][2];
        int index = 0;

        // Store the character and frequency in the 2D array
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Character as a string
                result[index][1] = String.valueOf(frequency[i]); // Frequency as a string
                index++;
            }
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
