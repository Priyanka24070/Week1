import java.util.Scanner;

public class Quadratic {

    // Method to find the roots of the quadratic equation ax^2 + bx + c = 0
    public static double[] findRoots(double a, double b, double c) {
        // Calculate the discriminant (delta)
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] { root1, root2 };
        } else if (delta == 0) {
            // One real root (both roots are the same)
            double root = -b / (2 * a);
            return new double[] { root };
        } else {
            // No real roots (delta is negative)
            return new double[0]; // Return an empty array if there are no real roots
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for a, b, and c
        System.out.print("Enter the coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = sc.nextDouble();

        // Call the method to find the roots
        double[] roots = findRoots(a, b, c);

        // Display the results
        if (roots.length == 0) {
            System.out.println("There are no real roots.");
        } else if (roots.length == 1) {
            System.out.println("The root is: " + roots[0]);
        } else {
            System.out.println("The roots are: " + roots[0] + " and " + roots[1]);
        }

                sc.close();
    }
}
