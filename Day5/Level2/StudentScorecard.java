import java.util.Random;

public class StudentScorecard {

    // Method to generate random scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3]; // 3 subjects: Physics, Chemistry, Math
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = random.nextInt(41) + 60; // Physics: 60 to 100
            scores[i][1] = random.nextInt(41) + 60; // Chemistry: 60 to 100
            scores[i][2] = random.nextInt(41) + 60; // Math: 60 to 100
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateStats(int[][] scores) {
        int numberOfStudents = scores.length;
        double[][] stats = new double[numberOfStudents][3]; // Total, Average, Percentage

        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            stats[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimal places
        }
        return stats;
    }

    // Method to calculate grade based on percentage
    public static String[] calculateGrades(double[][] stats) {
        int numberOfStudents = stats.length;
        String[] grades = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            double percentage = stats[i][2];

            if (percentage >= 90) {
                grades[i] = "A";
            } else if (percentage >= 80) {
                grades[i] = "B";
            } else if (percentage >= 70) {
                grades[i] = "C";
            } else if (percentage >= 60) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }
        return grades;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-15s %-10s%n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");
        System.out.println("------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-15.2f %-10s%n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 10;

        // Generate random scores for students
        int[][] scores = generateScores(numberOfStudents);

        // Calculate total, average, and percentage
        double[][] stats = calculateStats(scores);

        // Calculate grades based on percentage
        String[] grades = calculateGrades(stats);

        // Display the scorecard
        System.out.println("Student Scorecard:");
        displayScorecard(scores, stats, grades);
    }
}
