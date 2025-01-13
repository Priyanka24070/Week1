import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0;

        // Infinite loop to read numbers
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = scanner.nextDouble();

            // Break the loop if the number is 0 or negative
            if (number <= 0) {
                break;
            }

            total += number;
        }

        System.out.println("The total sum is: " + total);
    }
}