import java.util.Scanner;

public class CharacterFrequency2 {

    // Method to find the frequency of characters in a string using nested loops
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray();  // Convert string to character array
        int[] frequency = new int[characters.length];  // Array to store frequency of each character

        // Loop to find the frequency of characters using nested loops
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {  // Skip the character if it is marked as already counted
                frequency[i] = 1;  // Initialize the frequency of the character to 1
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        frequency[i]++;  // Increment the frequency for duplicates
                        characters[j] = '0';  // Mark the duplicate character as '0' to avoid recounting
                    }
                }
            }
        }

        // Create a 1D String array to store characters and their frequencies
        String[] result = new String[characters.length];
        int resultIndex = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {  // Only add non-zero characters to result
                result[resultIndex] = characters[i] + " : " + frequency[i];
                resultIndex++;
            }
        }

        // Create a new array with the exact size to return
        String[] finalResult = new String[resultIndex];
        System.arraycopy(result, 0, finalResult, 0, resultIndex);

        return finalResult;
    }

    // Method to display the result in a tabular format
    public static void displayFrequency(String[] frequencyArray) {
        System.out.println("Character\tFrequency");
        for (String item : frequencyArray) {
            System.out.println(item);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find the character frequency
        String[] frequencyResult = findCharacterFrequency(text);

        // Display the result
        displayFrequency(frequencyResult);
    }
}
