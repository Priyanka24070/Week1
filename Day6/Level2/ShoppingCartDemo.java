import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CartItem {
    // Attributes
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters for item details
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Method to calculate the total cost of the item (price * quantity)
    public double getTotalCost() {
        return price * quantity;
    }

    // Method to update the quantity of the item
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class ShoppingCart {
    private List<CartItem> items;  // List to store cart items

    // Constructor to initialize the list
    public ShoppingCart() {
        items = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(CartItem item) {
        items.add(item);
        System.out.println(item.getItemName() + " has been added to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        boolean itemRemoved = false;
        for (CartItem item : items) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                items.remove(item);
                itemRemoved = true;
                System.out.println(itemName + " has been removed from the cart.");
                break;
            }
        }
        if (!itemRemoved) {
            System.out.println(itemName + " was not found in the cart.");
        }
    }

    // Method to display the total cost of all items in the cart
    public void displayTotalCost() {
        double totalCost = 0;
        for (CartItem item : items) {
            totalCost += item.getTotalCost();
        }
        System.out.printf("Total cost of items in the cart: $%.2f%n", totalCost);
    }

    // Method to display all items in the cart
    public void displayCartItems() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Items in your cart:");
            for (CartItem item : items) {
                System.out.println("Item: " + item.getItemName() + ", Price: $" + item.getPrice() + ", Quantity: " + item.getQuantity());
            }
        }
    }
}

public class ShoppingCartDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        int choice;
        do {
            System.out.println("\nShopping Cart Options:");
            System.out.println("1. Add Item to Cart");
            System.out.println("2. Remove Item from Cart");
            System.out.println("3. Display Total Cost");
            System.out.println("4. Display Cart Items");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    // Add item to cart
                    System.out.print("Enter item name: ");
                    String itemName = sc.nextLine();
                    System.out.print("Enter item price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter item quantity: ");
                    int quantity = sc.nextInt();
                    CartItem newItem = new CartItem(itemName, price, quantity);
                    cart.addItem(newItem);
                    break;

                case 2:
                    // Remove item from cart
                    System.out.print("Enter item name to remove: ");
                    String removeItemName = sc.nextLine();
                    cart.removeItem(removeItemName);
                    break;

                case 3:
                    // Display total cost
                    cart.displayTotalCost();
                    break;

                case 4:
                    // Display cart items
                    cart.displayCartItems();
                    break;

                case 5:
                    // Exit
                    System.out.println("Thank you for shopping with us!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
