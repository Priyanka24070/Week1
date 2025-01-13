import java.util.Scanner;

public class LargestDigits {
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

        // Define the maximum size for the array and initialize variables
        final int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store them in the array
        while (number != 0) {
            if (index == maxDigit) {
                System.out.println("Reached the maximum digit limit of " + maxDigit + ".");
                break;
            }
            digits[index] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
            index++;
        }

        // Find the largest and second-largest digits
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("\nDigits in the number:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\n\nLargest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }


        scanner.close();
    }
}
