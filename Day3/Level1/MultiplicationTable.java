import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        // Get an integer input from the user
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        
        int[] multiplicationTable = new int[10];

        // Run a loop from 1 to 10 and store the results in the array
        for (int i = 0; i < 10; i++) {
            multiplicationTable[i] = number * (i + 1);
        }

        // Display the multiplication table
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }

        
        scanner.close();
    }
}
