import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
                double[] numbers = new double[10];
        
        double total = 0.0;
                int index = 0;
        
                Scanner scanner = new Scanner(System.in);
        
                while (true) {
            // Ask the user to enter a number
            System.out.print("Enter a number : ");
            double input = scanner.nextDouble();
            
            // Check if the user entered 0 or a negative number
            if (input <= 0) {
                break; // Exit the loop
            }
            
            // Check if the index is already 10, which means the array is full
            if (index >= 10) {
                break; // Exit the loop if array is full
            }
            
          
            numbers[index] = input;
          
            index++;
        }
        
        // Display the numbers entered and calculate the sum
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i]; // Add each number to the total
        }
        
        // Display the total sum
        System.out.println("Total sum: " + total);
        
        scanner.close();
    }
}
