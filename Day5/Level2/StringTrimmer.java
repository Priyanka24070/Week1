import java.util.Scanner;

public class StringTrimmer {

    // Method to trim leading and trailing spaces using charAt()
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i <= end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string with leading and trailing spaces: ");
        String inputText = scanner.nextLine();

        // Trim the spaces using custom method
        int[] trimIndexes = trimSpaces(inputText);
        String trimmedTextUsingCustomMethod = substringUsingCharAt(inputText, trimIndexes[0], trimIndexes[1]);

        // Trim the spaces using String built-in method
        String trimmedTextUsingBuiltInMethod = inputText.trim();

        // Compare the results
        boolean areEqual = compareStringsUsingCharAt(trimmedTextUsingCustomMethod, trimmedTextUsingBuiltInMethod);

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Text after trimming (Custom Method): \"" + trimmedTextUsingCustomMethod + "\"");
        System.out.println("Text after trimming (Built-In Method): \"" + trimmedTextUsingBuiltInMethod + "\"");
        System.out.println("Are the results equal? " + areEqual);

        // Close the scanner
        scanner.close();
    }
}
