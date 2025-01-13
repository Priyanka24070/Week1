import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = scanner.nextDouble();

        // Convert height from cm to m
        double heightInMeters = height / 100;
        double bmi = weight / (heightInMeters * heightInMeters);
        String weightStatus;
        if (bmi <= 18.4) {
            weightStatus = "Underweight";
        } else if (bmi >= 40.0) {
            weightStatus = "Obese";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Normal";
        }

        // Display results
        System.out.printf("%.2f%n", bmi);
        System.out.println("Weight Status: " + weightStatus);

        scanner.close();
    }
}