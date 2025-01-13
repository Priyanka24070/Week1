import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote based on age
    public boolean canStudentVote(int age) {
        // Validate if age is a negative number
        if (age < 0) {
            return false; // Negative age cannot be valid, hence false
        }
        // Check if age is 18 or greater
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();        
    // Create an array to store the ages of 10 students
        int[] ages = new int[10];

        // Loop to take input for the ages of 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            // Call canStudentVote() method to check if the student can vote
            boolean canVote = checker.canStudentVote(ages[i]);

            // Display the result
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

                sc.close();
    }
}
