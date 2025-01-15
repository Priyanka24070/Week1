import java.util.Scanner;

public class TextToLowerCaseComparison {

    // Method to convert text to lowercase using charAt()
    public static String convertToLowerCaseUsingCharAt(String text) {
        StringBuilder lowerCaseText = new StringBuilder();
        
        // Loop through each character of the input text
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            
            // Check if the character is uppercase and convert it to lowercase
            if (currentChar >= 'A' && currentChar <= 'Z') {
                // Convert uppercase to lowercase using ASCII value difference (32)
                char lowerChar = (char) (currentChar + 32);
                lowerCaseText.append(lowerChar);
            } else {
                // If the character is not uppercase, keep it as it is
                lowerCaseText.append(currentChar);
            }
        }
        
        return lowerCaseText.toString();
    }

    // Method to compare two strings and return a boolean result
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2); // Use String's built-in equals method for comparison
    }

    public static void main(String[] args) {
        // Create Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Take the complete text input from the user
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        // Convert the text to lowercase using the charAt() method
        String convertedTextUsingCharAt = convertToLowerCaseUsingCharAt(inputText);

        // Convert the text to lowercase using the String built-in toLowerCase() method
        String convertedTextUsingToLowerCase = inputText.toLowerCase();

        // Compare the results from both methods
        boolean areResultsSame = compareStrings(convertedTextUsingCharAt, convertedTextUsingToLowerCase);

        // Display the results
        System.out.println("Converted text using charAt(): " + convertedTextUsingCharAt);
        System.out.println("Converted text using toLowerCase(): " + convertedTextUsingToLowerCase);
        System.out.println("Are the results the same? " + (areResultsSame ? "Yes" : "No"));

        // Close the scanner
        scanner.close();
    }
}
