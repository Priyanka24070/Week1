import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status
    public static String[][] calculateBMI(double[][] student) {
        String[][] results = new String[10][4]; // Columns for Height, Weight, BMI, and Status

        for (int i = 0; i < student.length; i++) {
            double weight = student[i][0];
            double heightInCm = student[i][1];
            double heightInMeters = heightInCm / 100;

            // Calculate BMI
            double bmi = weight / (heightInMeters * heightInMeters);
            String status;

            // Determine BMI status
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Store results
            results[i][0] = String( heightInCm); // Height
            results[i][1] = String( weight);     // Weight
            results[i][2] = String( bmi);        // BMI
            results[i][3] = status;                            // Status
        }

        return results;
    }

    // Method to display the 2D array in tabular format
    public static void displayResults(String[][] results) {
        System.out.printf( "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("---------------------------------------------------------");
        for (String[] row : results) {
            System.out.printf( row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2]; // Columns for Weight and Height

        System.out.println("Enter the weight (kg) and height (cm) for 10 members:");

        // Take input for each person
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person ", i + 1);
            System.out.print("  Weight (kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("  Height (cm): ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and status
        String[][] results = calculateBMI(data);

        // Display the results
        System.out.println("\nResults:");
        displayResults(results);

        scanner.close();
    }
}
