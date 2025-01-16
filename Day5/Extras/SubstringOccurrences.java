import java.util.Scanner;

public class SubstringOccurrences {

    // Method to count occurrences of a substring in a string
    public static int countSubstringOccurrences(String str, String substring) {
        int count = 0;
        int index = 0;
        
        // Loop through the string to find the substring
        while ((index = str.indexOf(substring, index)) != -1) {
            count++;  // Increment count when substring is found
            index++;  // Move index to the next character
        }
        
        return count;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the main string and the substring from the user
        System.out.print("Enter the main string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the substring to find: ");
        String substring = scanner.nextLine();

        // Call the method to count occurrences of the substring
        int occurrences = countSubstringOccurrences(str, substring);

        // Display the result
        System.out.println("The substring '" + substring + "' occurs " + occurrences + " times in the main string.");

        scanner.close();
    }
}
