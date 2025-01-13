import java.util.Scanner;

public class NumberChecker {

    // Method to determine whether a number is positive, negative, or zero
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1; // Positive number
        } else if (number < 0) {
            return -1; // Negative number
        } else {
            return 0; // Zero
        }
    }

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Check the number 
        int result = checkNumber(number);

        // Output the result
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

     
        sc.close();
    }
}
