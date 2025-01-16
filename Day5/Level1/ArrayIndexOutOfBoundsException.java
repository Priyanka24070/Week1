import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        // Attempting to access an index larger than the array length
        System.out.println("Attempting to access an index out of bounds...");
        System.out.println("Accessing index 5: " + names[5]); // This will generate ArrayIndexOutOfBoundsException
    }

    // Method to demonstrate ArrayIndexOutOfBoundsException using try-catch block
    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        try {
            // Attempting to access an index larger than the array length
            System.out.println("Attempting to access an index out of bounds...");
            System.out.println("Accessing index 5: " + names[5]); // This will generate ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch and handle ArrayIndexOutOfBoundsException
            System.out.println("Caught an ArrayIndexOutOfBoundsException: The index is out of bounds for the array.");
        } catch (RuntimeException e) {
            // Catch and handle any other RuntimeExceptions
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Take input from the user for the number of names
        System.out.print("Enter the number of names you want to input: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline character after integer input

        // Create an array to hold names
        String[] names = new String[n];

        // Take names as input from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Call the method to generate ArrayIndexOutOfBoundsException
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException...");
        generateArrayIndexOutOfBoundsException(names); // This will cause the exception

        // Call the method to handle the exception using try-catch
        System.out.println("\nHandling ArrayIndexOutOfBoundsException with try-catch...");
        handleArrayIndexOutOfBoundsException(names); // This will catch and handle the exception

        // Close the scanner
        scanner.close();
    }
}
