import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of n
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the number is natural
        if (n < 0) {
            System.out.println("The number " + n + " is not a natural number.");
            return;
        }

        // Compute sum using formula
        int formulaSum = n * (n + 1) / 2;

        // Compute sum using for loop
        int loopSum = 0;
        for (int i = 1; i <= n; i++) {
            loopSum += i;
        }

        // Print results
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using for loop: " + loopSum);

        // Compare results
        if (formulaSum == loopSum) {
            System.out.println("Both computations match and are correct!");
        } else {
            System.out.println("The computations do not match, check for errors.");
        }
    }
}