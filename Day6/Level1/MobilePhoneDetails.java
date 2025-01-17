import java.util.Scanner;

class MobilePhone {
    // Attributes
    private String brand;
    private String model;
    private double price;

    // Constructor to initialize mobile phone details
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.printf("Price: %.2f%n", price);
    }
}

public class MobilePhoneDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input mobile phone details
        System.out.print("Enter the brand of the mobile phone: ");
        String brand = sc.nextLine();

        System.out.print("Enter the model of the mobile phone: ");
        String model = sc.nextLine();

        System.out.print("Enter the price of the mobile phone: ");
        double price = sc.nextDouble();

        // Create a MobilePhone object
        MobilePhone phone = new MobilePhone(brand, model, price);

        // Display the mobile phone details
        System.out.println();
        phone.displayDetails();

        sc.close();
    }
}
