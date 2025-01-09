import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the triangle (in inches): ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        double height = sc.nextDouble();

        // Calculate the area of the triangle in square inches
        double areaInInches = 0.5 * base * height;

        // Convert the area to square centimeters 
        double areaInCm = areaInInches * 6.4516;

        // Convert the area to square feet 
        double areaInFeet = areaInInches / 144;

        // print answer
        System.out.printf("The area of the triangle in square inches " + areaInInches + "  , square centimeters  " + areaInCm + " and in square feet is " + areaInFeet);

        sc.close();
    }
}
