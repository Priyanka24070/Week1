import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        // Define arrays to store ages and heights of the friends
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take input for ages and heights
        System.out.println("Enter the age and height of the friends:");
        for (int i = 0; i < 3; i++) {
            System.out.println(friends[i] + ":");
            while (true) {
                System.out.print("Age (in years): ");
                int age = scanner.nextInt();
                if (age > 0) {
                    ages[i] = age;
                    break;
                } else {
                    System.out.println("Invalid age! Please enter a positive number.");
                }
            }
            while (true) {
                System.out.print("Height (in cm): ");
                double height = scanner.nextDouble();
                if (height > 0) {
                    heights[i] = height;
                    break;
                } else {
                    System.out.println("Invalid height! Please enter a positive number.");
                }
            }
        }

        // Find the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display the results
        System.out.println("\nResults:");
        System.out.println("The youngest friend is " + friends[youngestIndex] + " with age " + ages[youngestIndex] + " years.");
        System.out.println("The tallest friend is " + friends[tallestIndex] + " with height " + heights[tallestIndex] + " cm.");

        // Close the scanner
        scanner.close();
}
}
