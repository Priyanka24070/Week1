import java.util.Scanner;

public class TextToUpperCaseComparison {

    // Method to convert text to uppercase using charAt()
    public static String convertToUpperCaseUsingCharAt(String text) {
        StringBuilder upperCaseText = new StringBuilder();
        
        // Loop through each character of the input text
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            
            // Check if the character is lowercase and convert it to uppercase
            if (currentChar >= 'a' && currentChar <= 'z') {
                // Convert lowercase to uppercase using ASCII value difference (32)
                char upperChar = (char) (currentChar - 32);
                upperCaseText.append(upperChar);
            } else {
                // If the character is not lowercase, keep it as it is
                upperCaseText.append(currentChar);
            }
        }
        
        return upperCaseText.toString();
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

        // Convert the text to uppercase using the charAt() method
        String convertedTextUsingCharAt = convertToUpperCaseUsingCharAt(inputText);

        // Convert the text to uppercase using the String built-in toUpperCase() method
        String convertedTextUsingToUpperCase = inputText.toUpperCase();

        // Compare the results from both methods
        boolean areResultsSame = compareStrings(convertedTextUsingCharAt, convertedTextUsingToUpperCase);

        // Display the results
        System.out.println("Converted text using charAt(): " + convertedTextUsingCharAt);
        System.out.println("Converted text using toUpperCase(): " + convertedTextUsingToUpperCase);
        System.out.println("Are the results the same? " + (areResultsSame ? "Yes" : "No"));

        // Close the scanner
        scanner.close();
    }
}
