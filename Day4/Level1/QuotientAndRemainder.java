import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor; // Calculate the quotient
        int remainder = number % divisor; // Calculate the remainder
        return new int[]{quotient, remainder}; // Return both values as an array
    }

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        // Input the number and divisor from the user
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Check if the divisor is zero to avoid division by zero
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero. Please try again.");
        } else {
            // Find the quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            // Output the results
            System.out.println("The quotient is: " + result[0]);
            System.out.println("The remainder is: " + result[1]);
        }

       
        sc.close();
    }
}
