import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number (dividend): ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number (divisor): ");
        int number2 = sc.nextInt();

        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Display the result
        System.out.printf("The Quotient is : " + quotient and " Reminder is : " + remainder " of two number " + number1 " and " + number2);

        
        sc.close();
    }
}
