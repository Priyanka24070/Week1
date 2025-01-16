import java.util.Scanner;

public class CompareStringsLexicographically {

    // Method to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) {
        // Get the length of both strings
        int length1 = str1.length();
        int length2 = str2.length();

        // Find the length of the shorter string to avoid IndexOutOfBoundsException
        int minLength = Math.min(length1, length2);

        // Compare characters of both strings
        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            // If characters are different, return the result based on their ASCII values
            if (char1 < char2) {
                return -1; // str1 is lexicographically smaller
            } else if (char1 > char2) {
                return 1; // str2 is lexicographically smaller
            }
        }

        // If all characters are the same in the shorter string, the shorter string comes first
        if (length1 < length2) {
            return -1; // str1 is lexicographically smaller
        } else if (length1 > length2) {
            return 1; // str2 is lexicographically smaller
        }

        // If both strings are equal in length and characters, return 0
        return 0;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input for two strings
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Call the method to compare the two strings
        int result = compareStrings(str1, str2);

        // Display the result based on the comparison
        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        } else if (result > 0) {
            System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are equal in lexicographical order");
        }

        scanner.close();
    }
}
