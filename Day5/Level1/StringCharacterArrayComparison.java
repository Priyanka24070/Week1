import java.util.Scanner;

public class StringCharacterArrayComparison {

    // Method to return all the characters in a string without using toCharArray()
    public static char[] getCharsWithoutToCharArray(String str) {
        char[] charArray = new char[str.length()];

        // Loop through the string and store each character in the array
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }

        return charArray;
    }

    // Method to compare two character arrays and return a boolean result
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;  // If lengths are different, arrays are not equal
        }

        // Compare characters one by one
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;  // If any character doesn't match, return false
            }
        }

        return true;  // If all characters match, return true
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take input from the user for the string
        System.out.print("Enter the string: ");
        String inputString = sc.next();

        // Get the character array using the user-defined method
        char[] charArrayUserDefined = getCharsWithoutToCharArray(inputString);

        // Get the character array using the built-in toCharArray() method
        char[] charArrayBuiltIn = inputString.toCharArray();

        // Compare the two arrays
        boolean comparisonResult = compareCharArrays(charArrayUserDefined, charArrayBuiltIn);

        // Display the results
        System.out.println("Character array using user-defined method: ");
        for (char c : charArrayUserDefined) {
            System.out.print(c + " ");
        }

        System.out.println("\nCharacter array using toCharArray() method: ");
        for (char c : charArrayBuiltIn) {
            System.out.print(c + " ");
        }

        System.out.println("\nDo the arrays match? " + comparisonResult);

        
        sc.close();
    }
}
