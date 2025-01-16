import java.util.Scanner;

public class RemoveCharacter {

    // Method to remove all occurrences of a specific character from a string
    public static String removeCharacter(String str, char charToRemove) {
        // Using String's replaceAll method to remove all occurrences of the specified character
        return str.replaceAll(Character.toString(charToRemove), "");
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input string from the user
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        // Accept the character to remove from the user
        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        // Call the method to remove the character and print the result
        String modifiedString = removeCharacter(str, charToRemove);
        System.out.println("Modified String: " + modifiedString);

        scanner.close();
    }
}
