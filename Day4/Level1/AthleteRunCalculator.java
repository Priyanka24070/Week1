import java.util.Scanner;

public class AthleteRunCalculator {

    // Method to calculate the perimeter of a triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate the number of rounds needed
    public static int calculateRounds(double perimeter, double distanceToRun) {
        return (int) Math.ceil(distanceToRun / perimeter); // Rounds up to the next integer
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Input the three sides of the triangular park
        System.out.print("Enter the first side of the triangle : ");
        double side1 = sc.nextDouble();

        System.out.print("Enter the second side of the triangle : ");
        double side2 = sc.nextDouble();

        System.out.print("Enter the third side of the triangle : ");
        double side3 = sc.nextDouble();

        // Validate if the sides can form a triangle
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            // Calculate the perimeter
            double perimeter = calculatePerimeter(side1, side2, side3);

            // Convert the perimeter to kilometers 
            double perimeterInKm = perimeter / 1000;

            // Calculate the number of rounds needed
            double distanceToRun = 5.0; // Distance in kilometers
            int rounds = calculateRounds(perimeterInKm, distanceToRun);

            // Output the result
            System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");
        } else {
            System.out.println("The sides do not form a valid triangle. Please try again.");
        }

      
        sc.close();
    }
}
