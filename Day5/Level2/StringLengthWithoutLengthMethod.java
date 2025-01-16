import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    // Method to find and return the length of a string without using the length() method
    public static int findLengthWithoutLengthMethod(String str) {
        int count = 0;
        
        try {
            // Loop through the string until charAt() throws a StringIndexOutOfBoundsException
            while (true) {
                str.charAt(count); // Access each character
                count++; // Increment the counter for each character
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Handle the exception when we exceed the valid indices of the string
            // The count will be the length of the string at this point
        }
        
        return count; // Return the total count which is the length of the string
    }

    public static void main(String[] args) {
        // Create Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Take the input text from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        // Call the user-defined method to find the length of the string
        int lengthWithoutMethod = findLengthWithoutLengthMethod(inputString);

        // Call the built-in length() method to get the length of the string
        int lengthWithMethod = inputString.length();

        // Display the results
        System.out.println("Length of the string using user-defined method: " + lengthWithoutMethod);
        System.out.println("Length of the string using built-in length() method: " + lengthWithMethod);

        // Close the scanner
        scanner.close();
    }
}
