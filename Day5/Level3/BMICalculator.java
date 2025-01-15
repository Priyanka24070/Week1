import java.util.Scanner;

public class BMICalculator {

    // Method to compute BMI and status
    public static String[][] computeBMI(double[][] data) {
        int numOfPersons = data.length;
        String[][] bmiData = new String[numOfPersons][4];

        for (int i = 0; i < numOfPersons; i++) {
            double weight = data[i][0]; // weight in kg
            double heightInMeters = data[i][1] / 100; // convert cm to meters
            double bmi = weight / (heightInMeters * heightInMeters);
            bmi = Math.round(bmi * 100.0) / 100.0; // round to 2 decimal places

            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Storing the results in the 2D String array
            bmiData[i][0] = String.format("%.2f", data[i][1]); // Height in cm
            bmiData[i][1] = String.format("%.2f", weight);     // Weight in kg
            bmiData[i][2] = String.format("%.2f", bmi);        // BMI
            bmiData[i][3] = status;                            // Status
        }
        return bmiData;
    }

    // Method to display the BMI table
    public static void displayBMI(String[][] bmiData) {
        System.out.printf("%-10s %-10s %-10s %-20s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-------------------------------------------------------------");
        for (String[] person : bmiData) {
            System.out.printf("%-10s %-10s %-10s %-20s%n", person[0], person[1], person[2], person[3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2]; // 10 rows for 10 persons, 2 columns for weight and height

        System.out.println("Enter the weight (in kg) and height (in cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            data[i][0] = scanner.nextDouble(); // Weight
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            data[i][1] = scanner.nextDouble(); // Height
        }

        // Compute BMI and status
        String[][] bmiData = computeBMI(data);

        // Display the results
        System.out.println("\nBMI Report:");
        displayBMI(bmiData);
    }
}
