import java.util.Scanner;

public class BMI_Calculator {

    // Method to calculate BMI for each person and populate the 2D array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0]; // Weight in kg
            double heightInCm = data[i][1]; // Height in cm
            double heightInMeters = heightInCm / 100; // Convert height from cm to meters
            
            // BMI = weight / (height * height) -> kg/m^2
            double bmi = weight / (heightInMeters * heightInMeters);
            data[i][2] = bmi; // Store the calculated BMI in the third column
        }
    }

    // Method to determine the BMI status of each person and return an array of statuses
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {
            double bmi = data[i][2]; // Get BMI value from the 2D array

            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }

        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a 2D array to store weight, height (in cm), and BMI for each person
        double[][] data = new double[10][3];

        // Taking user input for weight and height of 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble(); // Weight

            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble(); // Height in cm
        }

        // Calculate BMI for all persons
        calculateBMI(data);

        // Determine BMI status for all persons
        String[] bmiStatuses = determineBMIStatus(data);

        // Display the results
        System.out.println("\nBMI Report:");
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];
            double bmi = data[i][2];
            String status = bmiStatuses[i];
            
            System.out.printf("Person %d - Weight: %.2f kg, Height: %.2f cm, BMI: %.2f, Status: %s\n", 
                               (i + 1), weight, heightInCm, bmi, status);
        }

                sc.close();
    }
}
