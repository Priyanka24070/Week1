import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];

        // Take input for the age of 10 students
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        // Check voting eligibility
        for (int i = 0; i < studentAges.length; i++) {
            if (studentAges[i] < 0) {
                System.out.println("Invalid age entered: " + studentAges[i]);
            } else if (studentAges[i] >= 18) {
                System.out.println("The student with the age " + studentAges[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + studentAges[i] + " cannot vote.");
            }
        }

        scanner.close();
    }
}
