import java.util.Scanner;

public class IllegalArgumentException {

    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException(String str) {
        // Attempting to use the substring method with an invalid range (start index > end index)
        System.out.println("Attempting to extract a substring with an invalid range...");
        String result = str.substring(5, 2); // This will generate IllegalArgumentException
        System.out.println("Substring: " + result); // This line won't be reached due to exception
    }

    // Method to demonstrate IllegalArgumentException using try-catch block
    public static void handleIllegalArgumentException(String str) {
        try {
            // Attempting to use the substring method with an invalid range
            System.out.println("Attempting to extract a substring with an invalid range...");
            String result = str.substring(5, 2); // This will generate IllegalArgumentException
            System.out.println("Substring: " + result); // This line won't be reached due to exception
        } catch (IllegalArgumentException e) {
            // Catch and handle IllegalArgumentException
            System.out.println("Caught an IllegalArgumentException: The start index cannot be greater than the end index.");
        } catch (RuntimeException e) {
            // Catch and handle any other RuntimeExceptions
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Take input from the user for the string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Call the method to generate IllegalArgumentException
        System.out.println("\nGenerating IllegalArgumentException...");
        generateIllegalArgumentException(userInput); // This will cause the exception

        // Call the method to handle the exception using try-catch
        System.out.println("\nHandling IllegalArgumentException with try-catch...");
        handleIllegalArgumentException(userInput); // This will catch and handle the exception

        // Close the scanner
        scanner.close();
    }
}
