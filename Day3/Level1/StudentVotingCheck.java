import java.util.Scanner;

public class StudentVotingCheck {
    public static void main(String[] args) {
       
        int[] ages = new int[10];
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take input for each student's age
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        // Loop through the array to check voting eligibility
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            if (age < 0) {
                System.out.println("Invalid age for student " + (i + 1) + ": " + age);
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
