import java.util.Scanner;

public class NumberChecker {

    // Method to check whether the number is positive or negative
    public static String isPositive(int number) {
        if (number < 0) {
            return "Negative";
        } else {
            return "Positive";
        }
    }

    // Method to check if a number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Method to compare two numbers and return 1 if number1 > number2, 0 if equal, -1 if number1 < number2
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Taking user input for 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Loop through the array to check each number
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            String positivity = isPositive(number);
            System.out.println("Number " + (i + 1) + " is " + positivity);

            // If the number is positive, check if it's even or odd
            if (positivity.equals("Positive")) {
                String evenOdd = isEven(number);
                System.out.println("Number " + (i + 1) + " is " + evenOdd);
            }
        }

        // Compare the first and last elements of the array
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if (result == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (result == -1) {
            System.out.println("The first number is less than the last number.");
        } else {
            System.out.println("The first number is equal to the last number.");
        }

                sc.close();
    }
}
