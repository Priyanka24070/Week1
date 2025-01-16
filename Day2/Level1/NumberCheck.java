import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        // Define an integer array of 5 elements
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        // Get user input to store in the array
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                // Check if the number is even or odd
                if (numbers[i] % 2 == 0) {
                    System.out.println("Number " + numbers[i] + " is positive and even.");
                } else {
                    System.out.println("Number " + numbers[i] + " is positive and odd.");
                }
            } else if (numbers[i] < 0) {
                // Print negative
                System.out.println("Number " + numbers[i] + " is negative.");
            } else {
                // Print zero
                System.out.println("Number " + numbers[i] + " is zero.");
            }
        }

        // Compare the first and last elements of the array
        if (numbers[0] > numbers[4]) {
            System.out.println("The first element (" + numbers[0] + ") is greater than the last element (" + numbers[4] + ").");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("The first element (" + numbers[0] + ") is less than the last element (" + numbers[4] + ").");
        } else {
            System.out.println("The first element (" + numbers[0] + ") is equal to the last element (" + numbers[4] + ").");
        }

        scanner.close();
    }
}

