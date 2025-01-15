import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt() method
    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        
        // Add characters from start index to end index (exclusive) to the StringBuilder
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        
        return substring.toString();//converting StringBuilder substring to String
    }

    // Method to compare two strings
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Take input from the user for the string and the indices
        System.out.print("Enter the string: ");
        String inputString = sc.next();
        
        System.out.print("Enter the start index: ");
        int startIndex = sc.nextInt();
        
        System.out.print("Enter the end index: ");
        int endIndex = sc.nextInt();
        
        // Generate substring using charAt() method
        String substringCharAt = substringUsingCharAt(inputString, startIndex, endIndex);
        
        // Generate substring using the built-in substring() method
        String substringBuiltIn = inputString.substring(startIndex, endIndex);
        
        // Compare the substrings using the compareStringsUsingCharAt method
        boolean resultComparison = compareStringsUsingCharAt(substringCharAt, substringBuiltIn);
        
        // Display results
        System.out.println("Substring using charAt(): " + substringCharAt);
        System.out.println("Substring using substring(): " + substringBuiltIn);
        System.out.println("Do the substrings match? " + resultComparison);
        
                sc.close();
    }
}
