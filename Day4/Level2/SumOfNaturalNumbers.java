import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find the sum of n natural numbers using recursion
    public static int sumRecursive(int n) {
        // Base case: if n is 1, return 1
        if (n == 1) {
            return 1;
        }
        // Recursive case: sum n + sum of (n-1)
        return n + sumRecursive(n - 1);
    }

    // Method to find the sum of n natural numbers using the formula n*(n+1)/2
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Input the number n
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if the input is a natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
            return; // Exit the program if the input is not valid
        }

        // Calculate the sum using recursion
        int recursiveSum = sumRecursive(n);

        // Calculate the sum using the formula
        int formulaSum = sumFormula(n);

        // Display the results
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using the formula: " + formulaSum);

        // Compare the two results
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the correct result.");
        } else {
            System.out.println("There is a discrepancy in the results.");
        }

                sc.close();
    }
}
