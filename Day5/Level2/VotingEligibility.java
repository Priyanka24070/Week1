import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

    // Method to generate random ages for n students
    public static int[] generateAges(int numberOfStudents) {
        Random random = new Random();
        int[] ages = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            // Generate random age between 10 and 30
            ages[i] = random.nextInt(21) + 10;
        }
        return ages;
    }

    // Method to check voting eligibility and return a 2D array with age and eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibilityData = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            eligibilityData[i][0] = String.valueOf(ages[i]); // Store age
            if (ages[i] < 0) {
                eligibilityData[i][1] = "Invalid Age"; // Negative age
            } else if (ages[i] >= 18) {
                eligibilityData[i][1] = "Can Vote"; // Eligible to vote
            } else {
                eligibilityData[i][1] = "Cannot Vote"; // Not eligible to vote
            }
        }
        return eligibilityData;
    }

    // Method to display the 2D array in a tabular format
    public static void displayTable(String[][] data) {
        System.out.printf("%-10s %-15s%n", "Age", "Voting Status");
        System.out.println("----------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generate random ages
        int[] ages = generateAges(numberOfStudents);

        // Check voting eligibility
        String[][] eligibilityData = checkVotingEligibility(ages);

        // Display the results in a tabular format
        System.out.println("\nVoting Eligibility Table:");
        displayTable(eligibilityData);

        // Close the scanner
        scanner.close();
    }
}
