
import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number to find its multiples below 100: ");
        int number = scanner.nextInt();

        // Find and print multiples of the number below 100
        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = 1; i < 100; i++) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
    }
}
