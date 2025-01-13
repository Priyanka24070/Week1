import java.util.Random;

public class StudentScoreCard {

    // Method to generate random PCM scores for students
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, and Math

        // Generating random 2-digit scores for each student in each subject
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 50 + rand.nextInt(50); // Random score between 50 and 99 for Physics
            scores[i][1] = 50 + rand.nextInt(50); // Random score between 50 and 99 for Chemistry
            scores[i][2] = 50 + rand.nextInt(50); // Random score between 50 and 99 for Math
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4]; // 4 columns: Total, Average, Percentage, and Subject Scores

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimal places
            results[i][3] = total; // Total score for displaying in tabular format
        }

        return results;
    }

    // Method to display the scorecard in tabular format
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Student-%d\t%-10d %-10d %-10d %-10.2f %-10.2f %-10.2f\n", 
                               i + 1, scores[i][0], scores[i][1], scores[i][2], 
                               results[i][0], results[i][1], results[i][2]);
        }

        System.out.println("-------------------------------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int numStudents = 5; // Change this number to the number of students you want to input

        // Generate random scores for students
        int[][] scores = generateScores(numStudents);

        // Calculate total, average, and percentage for each student
        double[][] results = calculateResults(scores);

        // Display the scorecard
        displayScorecard(scores, results);
    }
}
