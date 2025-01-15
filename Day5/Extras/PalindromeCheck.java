import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //enter a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert the string to lowercase and remove spaces for accurate comparison
        String normalizedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Initialize pointers
        int start = 0;
        int end = normalizedInput.length() - 1;

        // Check for palindrome
        boolean isPalindrome = true;
        while (start < end) {
            if (normalizedInput.charAt(start) != normalizedInput.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
