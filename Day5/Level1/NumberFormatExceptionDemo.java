import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String input) {
        // This will throw NumberFormatException if input is not a valid integer
        int number = Integer.parseInt(input);
        System.out.println("Parsed number: " + number);
    }

    // Method to handle NumberFormatException and other runtime exceptions
    public static void handleException(String input) {
        try {
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Input is not a valid integer.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to parse as an integer: ");
        String userInput = scanner.nextLine();

        System.out.println("\nCalling generateException method:");
        try {
            generateException(userInput);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred in generateException method.");
        }

        System.out.println("\nCalling handleException method:");
        handleException(userInput);

        scanner.close();
    }
}
