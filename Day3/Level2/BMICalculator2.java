import java.util.Scanner;

public class BMICalculator2 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // Create a 2D array to store weight, height, and BMI (3 columns for each person)
        double[][] personData = new double[numberOfPersons][3];
        // Create an array to store weight status
        String[] weightStatus = new String[numberOfPersons];

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

            // Store height and weight in the personData array
            personData[i][0] = height;  // Column 0 - height
            personData[i][1] = weight;  // Column 1 - weight

            // Calculate BMI (BMI = weight / height^2)
            double bmi = weight / (height * height);
            personData[i][2] = bmi;  // Column 2 - BMI

            // Determine weight status based on BMI value
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status for each person
        System.out.println("\nPerson Data (Height, Weight, BMI, Status):");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][0] + " meters");
            System.out.println("Weight: " + personData[i][1] + " kg");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
        }

      
        scanner.close();
    }
}
