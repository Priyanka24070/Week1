import java.util.Scanner;

public class EuclideanDistanceAndLineEquation {

    // Method to calculate the Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    // Method to find the equation of the line using two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Calculate slope (m)
        double m = (y2 - y1) / (x2 - x1);
        
        // Calculate y-intercept (b)
        double b = y1 - (m * x1);
        
        // Return slope and y-intercept as an array
        return new double[] {m, b};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take inputs for the coordinates of the two points
        System.out.print("Enter the coordinates of the first point (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter the coordinates of the second point (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Calculate and display the Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("The Euclidean distance between the two points is: " + distance);

        // Calculate and display the equation of the line
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        System.out.println("The equation of the line is: y = " + lineEquation[0] + "x + " + lineEquation[1]);
    }
}
