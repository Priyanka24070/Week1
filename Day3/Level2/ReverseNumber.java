import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        // Validate the input
        if (number <= 0) {
            System.out.println("Error: Please enter a positive number.");
            scanner.close();
            return;
        }

        // Find the count of digits in the number
        int tempNumber = number;
        int count = 0;
        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }

        // Create an array to store the digits
        int[] digits = new int[count];

        // Fill the digits array with the digits of the number
        tempNumber = number;
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }

        // Create an array to store the digits in reverse order
        int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }

        // Display the elements of the array in reverse order
        System.out.println("The digits of the number in reverse order are:");
        for (int i = 0; i < count; i++) {
            System.out.print(reversedDigits[i]);
        }

        
        scanner.close();
    }
}
