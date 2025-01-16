import java.util.Scanner;

public class StudentMarks{
    // generating randomo marks for all three subject
    static int[][] generateRandomScores(int n){
        int[][] scores = new int[n][3];
        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                scores[i][j] = (int)(Math.random()*100);
            }
        }
        return scores;
    }

    static double[][] calculateTotalAveragePercentage(int[][] scores){
        int numberOfStudents = scores.length;
        double[][] results = new double[numberOfStudents][3]; // Total, Average, Percentage

        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total; // Total
            results[i][1] = Math.round(average * 100.0) / 100.0; // Average rounded to 2 digits
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Percentage rounded to 2 digits
        }
        return results;
    }

    // displaying result based on the chart
    static String[] calculateGrade(double[][] percentages){
        String[] grades = new String[percentages.length];
        for (int i = 0; i < percentages.length; i++) {
            double percentage = percentages[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }
    // Method to display the scorecard using println
   static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
    // Header
    System.out.println("Student  Physics  Chemistry  Math  Total  Average  Percentage  Grade");
    
    // Body
    for (int i = 0; i < scores.length; i++) {
        System.out.println(
            (i + 1) + "\t" + 
            scores[i][0] + "\t" + 
            scores[i][1] + "\t" + 
            scores[i][2] + "\t" + 
            (int)results[i][0] + "\t" + 
            results[i][1] + "\t" + 
            results[i][2] + "\t" + 
            grades[i]
        );
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt(); // Number of students

        // Generate PCM scores for students
        int[][] pcmScores = generateRandomScores(numberOfStudents);

        // Calculate total, average, and percentage for each student
        double[][] results = calculateTotalAveragePercentage(pcmScores);

        // Calculate grades for each student
        String[] grades = calculateGrade(results);

        // Display the scorecard
        System.out.println("Student Scorecard:");
        displayScorecard(pcmScores, results, grades);

        sc.close();
    }
}