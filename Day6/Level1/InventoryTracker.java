import java.util.Scanner;

class Item {
    // Attributes
    private int itemCode;
    private String itemName;
    private double price;

    // Constructor
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class InventoryTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input item details
        System.out.print("Enter item code: ");
        int itemCode = sc.nextInt();
         sc.nextLine(); // Consume the leftover newline character

        
        System.out.print("Enter item name: ");
        String itemName = sc.nextLine();

        System.out.print("Enter price of the item: ");
        double price = sc.nextDouble();

        // Create an Item object
        Item item = new Item(itemCode, itemName, price);

        // Display item details
        System.out.println("\nItem Details:");
        item.displayDetails();

        // Input quantity
        System.out.print("\nEnter quantity: ");
        int quantity = sc.nextInt();

        // Calculate and display total cost
        double totalCost = item.calculateTotalCost(quantity);
        System.out.printf("Total Cost for %d items: %.2f%n", quantity, totalCost);

        sc.close();
    }
}
