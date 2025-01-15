import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Compare characters from the start and end of the string
    public static boolean isPalindromeUsingLoop(String text) {
        int start = 0;
        int end = text.length() - 1;
        
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // If characters don't match, it's not a palindrome
            }
            start++;
            end--;
        }
        return true; // If all characters match, it's a palindrome
    }

    // Logic 2: Recursive method to compare characters from start and end
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true; // Base case: If start index is greater than or equal to end index, it's a palindrome
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false; // If characters don't match, it's not a palindrome
        }
        return isPalindromeRecursive(text, start + 1, end - 1); // Recursive call with incremented start and decremented end
    }

    // Logic 3: Using character arrays and reversing the string
    public static boolean isPalindromeUsingCharArray(String text) {
        char[] originalArray = text.toCharArray(); // Convert the string to a character array
        char[] reverseArray = new char[text.length()];
        
        // Reverse the array
        for (int i = 0; i < text.length(); i++) {
            reverseArray[i] = text.charAt(text.length() - 1 - i);
        }
        
        // Compare the original and reverse arrays
        for (int i = 0; i < text.length(); i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false; // If characters don't match, it's not a palindrome
            }
        }
        return true; // If all characters match, it's a palindrome
    }

    // Main method to call the palindrome check methods
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        
        // Trim the input to remove spaces and handle case sensitivity
        text = text.replaceAll("\\s", "").toLowerCase();

        // Logic 1: Using loop
        if (isPalindromeUsingLoop(text)) {
            System.out.println("The text is a palindrome (checked using loop).");
        } else {
            System.out.println("The text is not a palindrome (checked using loop).");
        }

        // Logic 2: Using recursion
        if (isPalindromeRecursive(text, 0, text.length() - 1)) {
            System.out.println("The text is a palindrome (checked using recursion).");
        } else {
            System.out.println("The text is not a palindrome (checked using recursion).");
        }

        // Logic 3: Using character arrays
        if (isPalindromeUsingCharArray(text)) {
            System.out.println("The text is a palindrome (checked using character array).");
        } else {
            System.out.println("The text is not a palindrome (checked using character array).");
        }
        
        scanner.close();
    }
}
