import java.util.Scanner;

public class StudentGrading2D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

                double[][] marks = new double[numStudents][3];

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            marks[i][0] = scanner.nextDouble();
            System.out.print("Chemistry: ");
            marks[i][1] = scanner.nextDouble();
            System.out.print("Maths: ");
            marks[i][2] = scanner.nextDouble();
        }

        System.out.println("\n--- Results ---");

        // Calculate percentage and grade for each student
        for (int i = 0; i < numStudents; i++) {
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = (totalMarks / 300) * 100; // Assuming each subject is out of 100

            // Determine grade and remarks
            String grade;
            String remarks;

            if (percentage >= 80) {
                grade = "A";
                remarks = "Level 4, above agency-normalized standards";
            } else if (percentage >= 70) {
                grade = "B";
                remarks = "Level 3, at agency-normalized standards";
            } else if (percentage >= 60) {
                grade = "C";
                remarks = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentage >= 50) {
                grade = "D";
                remarks = "Level 1, well below agency-normalized standards";
            } else if (percentage >= 40) {
                grade = "E";
                remarks = "Level 1-, too below agency-normalized standards";
            } else {
                grade = "R";
                remarks = "Remedial standards";
            }

            // Output the results for each student
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("  Total Marks: " + totalMarks + "/300");
            System.out.printf("  Percentage: %.2f%%\n", percentage);
            System.out.println("  Grade: " + grade);
            System.out.println("  Remarks: " + remarks);
        }

        scanner.close();
    }
}