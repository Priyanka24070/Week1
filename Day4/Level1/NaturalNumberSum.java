import java.util.Scanner;

public class NaturalNumberSum {

    // Method to calculate the sum of n natural numbers
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // Add the current number to the sum
        }
        return sum;
    }

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        // Input the value of n from the user
        System.out.print("Enter a  integer: ");
        int n = sc.nextInt();

        // Validate the input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate the sum of n natural numbers
            int sum = findSum(n);

            // Output the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

       
        sc.close();
    }
}
