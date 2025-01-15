import java.util.Scanner;

public class StringComparison {
    
    // Method to compare two strings using charAt() method
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;  // If lengths are different, strings are not equal
        }
        
        // Compare characters one by one
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;  // If any character doesn't match, return false
            }
        }
        
        return true;  // If all characters match, return true
    }

    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
        
        // Take input from the user for two strings
        System.out.print("Enter the first string: ");
        String string1 = sc.next();
        
        System.out.print("Enter the second string: ");
        String string2 = sc.next();
        
        
        boolean resultUsingCharAt = compareStringsUsingCharAt(string1, string2);
        
        // Compare strings using built-in equals() method
        boolean resultUsingEquals = string1.equals(string2);
        
        // Display results
        System.out.println("Comparison using charAt() method: " + resultUsingCharAt);
        System.out.println("Comparison using equals() method: " + resultUsingEquals);
        
        // Check if both methods give the same result
        if (resultUsingCharAt == resultUsingEquals) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The methods give different results.");
        }

        // Close the scanner
        sc.close();
    }
}
