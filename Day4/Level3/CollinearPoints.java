import java.util.Scanner;

public class CollinearPoints {

    // Method to check if three points are collinear using the slope formula
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        
        return (slopeAB == slopeBC && slopeAB == slopeAC);
    }

    // Method to check if three points are collinear using the area of triangle formula
    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return (area == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for three points A, B, C
        System.out.print("Enter coordinates of point A (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter coordinates of point B (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.print("Enter coordinates of point C (x3, y3): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        // Check if the points are collinear using the slope formula
        boolean collinearBySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        if (collinearBySlope) {
            System.out.println("The points are collinear by the slope method.");
        } else {
            System.out.println("The points are NOT collinear by the slope method.");
        }

        // Check if the points are collinear using the area formula
        boolean collinearByArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        if (collinearByArea) {
            System.out.println("The points are collinear by the area method.");
        } else {
            System.out.println("The points are NOT collinear by the area method.");
        }
    }
}
