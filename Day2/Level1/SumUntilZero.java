import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0;
        double number;

        // Continue to read numbers while zero not comes;
        do {
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextDouble();
            total += number;
        } while (number != 0);

        System.out.println("The total sum is: " + total);
    }
}