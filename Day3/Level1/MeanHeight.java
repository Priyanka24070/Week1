import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        // Create a double array to store the heights of 11 players
        double[] heights = new double[11];
                double sum = 0.0;
        Scanner scanner = new Scanner(System.in);

        // Get input values for heights
        System.out.println("Enter the heights of 11 players :");
        for (int i = 0; i < 11; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i]; // Add each height to the sum
        }

        // Calculate the mean height
        double mean = sum / 11;

        // Print the mean height
        System.out.printf("The mean height of the football team is: %.2f cm%n", mean);

               scanner.close();
    }
}
