import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the sides of the triangular park
        System.out.print("Enter the first side of the triangle in meters: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter the second side of the triangle in meters: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter the third side of the triangle in meters: ");
        double side3 = sc.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Convert 5 km to meters
        double totalDistance = 5000;

        // Calculate the number of rounds the athlete needs to complete
        double rounds = totalDistance / perimeter;

        // Print the result
        System.out.println("The total number of rounds the athlete will run is " + rounds);

        sc.close();
    }
}
