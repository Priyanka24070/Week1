import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the first number
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        // Take input for the second number
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        // Swap the numbers using a temporary variable
        
        number1=number1^ number2;
        number2=number1^ number2;
        number1=number1^ number2;

        // Print the swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        sc.close();
    }
}
