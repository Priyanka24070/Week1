import java.util.Scanner;

public class NumberFormatException {

    // Method to generate NumberFormatException
    public static void generateNumberFormatException(String text) {
        // Attempting to parse the text as an integer (which will fail if it's not a valid number)
        System.out.println("Attempting to parse the input text to an integer...");
        int number = Integer.parseInt(text); // This will generate NumberFormatException if the text is not a valid number
        System.out.println("Parsed number: " + number); // This line won't be reached due to the exception
    }

    // Method to demonstrate NumberFormatException using try-catch block
    public static void handleNumberFormatException(String text) {
        try {
            // Attempting to parse the text as an integer (which will fail if it's not a valid number)
            System.out.println("Attempting to parse the input text to an integer...");
            int number = Integer.parseInt(text); // This will generate NumberFormatException if the text is not a valid number
            System.out.println("Parsed number: " + number); // This line won't be reached due to the exception
        } catch (NumberFormatException e) {
            // Catch and handle NumberFormatException
            System.out.println("Caught a NumberFormatException: The input text is not a valid number.");
        } catch (RuntimeException e) {
            // Catch and handle any other RuntimeExceptions
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Take input from the user for the text
        System.out.print("Enter a text (it should be a valid number): ");
        String userInput = scanner.nextLine();

        // Call the method to generate NumberFormatException
        System.out.println("\nGenerating NumberFormatException...");
        generateNumberFormatException(userInput); // This will cause the exception

        // Call the method to handle the exception using try-catch
        System.out.println("\nHandling NumberFormatException with try-catch...");
        handleNumberFormatException(userInput); // This will catch and handle the exception

        // Close the scanner
        scanner.close();
    }
}
