import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // take input from the user 
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Loop through 6 to 9 and print the multiplication table
        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        
        // Close the scanner
        scanner.close();
    }
}
