
import java.util.Scanner;

public class ComputePercentage {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int physics = scn.nextInt();
        int chemistry = scn.nextInt();
        int maths = scn.nextInt();
        double totalMarks = 300; // Lets say each subject has equal weightage
        double averageMark = (physics + chemistry + maths) / 3.0;
        String gradeAndRemarks = "";
        if (averageMark >= 80) {
            gradeAndRemarks = "Level 4";
        } else if (averageMark >= 70 && averageMark < 80) {
            gradeAndRemarks = "Level 3";
        } else if (averageMark >= 60 && averageMark < 70) {
            gradeAndRemarks = "Level 2";
        } else if (averageMark >= 50 && averageMark < 60) {
            gradeAndRemarks = "Level 1";
        } else if (averageMark >= 40 && averageMark < 50) {
            gradeAndRemarks = "Level 1-";
        } else {
            gradeAndRemarks = "Remedial standards";
        }

        System.out.println("Average Mark: " + String.format("%.2f", averageMark));
        System.out.println("Grade and Remarks: " + gradeAndRemarks);
    }
}