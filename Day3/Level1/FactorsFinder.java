import java.util.Scanner;

public class FactorsFinder {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        // Take the input for the number
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        // Check if the input is a natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            scanner.close();
            return;
        }


        int maxFactor = 10; // Initial size of the factors array
        int[] factors = new int[maxFactor]; // Array to store factors
        int index = 0; // Index to track the position in the factors array

        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If the index reaches maxFactor, resize the array
                if (index == maxFactor) {
                    // Double the size of the array
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp; // Assign the resized array
                }
                // Add the factor to the array
                factors[index] = i;
                index++;
            }
        }

        // Display the factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();


        scanner.close();
    }
}
