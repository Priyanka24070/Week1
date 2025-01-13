import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // Create arrays to store the weight, height, BMI, and weight status
        double[] heights = new double[numberOfPersons];
        double[] weights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] weightStatuses = new String[numberOfPersons];

        // Take input for weight and height of the persons
        for (int i = 0; i < numberOfPersons; i++) {
            double height, weight;

            // Input height (ensure it is positive)
            do {
                System.out.print("Enter the height (in meters) for person " + (i + 1) + ": ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be positive. Please enter again.");
                }
            } while (height <= 0);

            // Input weight (ensure it is positive)
            do {
                System.out.print("Enter the weight (in kg) for person " + (i + 1) + ": ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be positive. Please enter again.");
                }
            } while (weight <= 0);

            // Store height and weight
            heights[i] = height;
            weights[i] = weight;

            // Calculate BMI (BMI = weight / height^2)
            double bmi = weight / (height * height);
            bmis[i] = bmi;

            // Determine weight status based on BMI value
            if (bmi < 18.5) {
                weightStatuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatuses[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                weightStatuses[i] = "Overweight";
            } else {
                weightStatuses[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status for each person
        System.out.println("\nPerson Data (Height, Weight, BMI, Status):");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Height: " + heights[i] + " meters");
            System.out.println("Weight: " + weights[i] + " kg");
            System.out.println("BMI: " + bmis[i]);
            System.out.println("Weight Status: " + weightStatuses[i]);
        }

       
        scanner.close();
    }
}
