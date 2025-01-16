
import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number to find its greatest factor besides itself: ");
        int number = scanner.nextInt();
        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; // Stop the loop as we found the greatest factor
            }
        }
        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
    }
}
