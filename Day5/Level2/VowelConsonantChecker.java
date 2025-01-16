import java.util.Scanner;

public class VowelConsonantChecker {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert character to lowercase
        char lowerChar = Character.toLowerCase(ch);

        // Check if the character is a vowel
        if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
            return "Vowel";
        }
        // Check if the character is a consonant
        else if (lowerChar >= 'a' && lowerChar <= 'z') {
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    // Method to analyze the string and return the 2D array of character types
    public static String[][] analyzeString(String str) {
        String[][] result = new String[str.length()][2];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch); // Character
            result[i][1] = checkCharacterType(ch); // Character type (Vowel, Consonant, Not a Letter)
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayResult(String[][] array) {
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        System.out.println("-----------------------------");

        for (String[] row : array) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Analyze the string
        String[][] analysisResult = analyzeString(inputText);

        // Display the result in tabular format
        System.out.println("\nCharacter Analysis:");
        displayResult(analysisResult);

        // Close the scanner
        scanner.close();
    }
}
