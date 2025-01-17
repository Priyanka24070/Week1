import java.util.Scanner;

class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display the details of the circle
    public void display() {
        System.out.printf("Area is: " + calculateArea());
        System.out.printf("\nCircumference is: " + calculateCircumference());
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input radius from the user
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        // Create a Circle object 
        Circle circle = new Circle(radius);
        circle.display();

        sc.close();
    }
}
