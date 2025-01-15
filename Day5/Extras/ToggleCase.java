import java.util.Scanner;

public class ToggleCase {

    // Method to toggle the case of each character in a string
    public static String toggleCase(String input) {
        StringBuilder result = new StringBuilder();
        
        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // Check if the character is uppercase or lowercase and toggle the case
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch); // If it's not a letter, keep the character as it is
            }
        }
        
        return result.toString();
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input string from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to toggle case
        String toggledString = toggleCase(input);

        // Display the toggled case string
        System.out.println("Toggled case string: " + toggledString);

        scanner.close();
    }
}
