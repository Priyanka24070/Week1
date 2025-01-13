import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate trigonometric functions (sine, cosine, and tangent)
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert the angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent using Math functions
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results in an array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Input the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();

        // Calculate the trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);

        // Output the results
        System.out.printf("Sine of %.2f°: %.4f%n", angle, results[0]);
        System.out.printf("Cosine of %.2f°: %.4f%n", angle, results[1]);
        System.out.printf("Tangent of %.2f°: %.4f%n", angle, results[2]);

                sc.close();
    }
}
