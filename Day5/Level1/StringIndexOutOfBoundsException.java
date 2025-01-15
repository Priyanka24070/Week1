import java.util.Scanner;

public class StringIndexOutOfBoundsException {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String str) {
        // Accessing an index beyond the length of the string
        // For example, accessing index 100 on a string of length 5
        System.out.println("Character at index 100: " + str.charAt(100)); // This will cause a StringIndexOutOfBoundsException
    }

    // Method to handle StringIndexOutOfBoundsException using try-catch block
    public static void handleStringIndexOutOfBoundsException(String str) {
        try {
            // Attempt to access an index beyond the length of the string
            System.out.println("Character at index 100: " + str.charAt(100)); // This will generate the exception
        } catch (StringIndexOutOfBoundsException e) {
            // Handle the exception and print an appropriate message
            System.out.println("Caught a StringIndexOutOfBoundsException: The index is out of bounds for the string.");
        }
    }

    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        // Call the method to generate StringIndexOutOfBoundsException
        System.out.println("\nGenerating StringIndexOutOfBoundsException...");
        generateStringIndexOutOfBoundsException(userInput); // This will cause the exception

        // Call the method to handle the exception using try-catch
        System.out.println("\nHandling StringIndexOutOfBoundsException with try-catch...");
        handleStringIndexOutOfBoundsException(userInput); // This will catch and handle the exception

                sc.close();
    }
}
