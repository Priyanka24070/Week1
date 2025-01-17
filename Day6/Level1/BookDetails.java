import java.util.Scanner;

class Book {
    // Create attributes
    String title; // Corrected spelling
    String author;
    double price;

    // Method to display book details
    public void display() {
        System.out.println("Title of the Book is: " + title);
        System.out.println("Author of the Book is: " + author);
        System.out.println("Price of the Book is: " + price);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an object of the Book class
        Book book = new Book();

        // Take input from the user
        System.out.print("Enter title of the book: ");
        book.title = sc.nextLine(); // Assign input to the object's title attribute

        System.out.print("Enter author of the book: ");
        book.author = sc.nextLine(); // Assign input to the object's author attribute

        System.out.print("Enter price of the book: ");
        book.price = sc.nextDouble(); // Correctly read double value for price

        // Call the display method to print details of the book
        book.display();

        sc.close();
    }
}
