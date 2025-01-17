// MovieTicket class
class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor to initialize ticket details
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "Not Booked"; // Initially not booked
        this.price = 0.0;
    }

    // Method to book a ticket with a seat number and price
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        if (!seatNumber.equals("Not Booked")) {
            System.out.println("Ticket Booked!");
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Ticket Price: $" + price);
        } else {
            System.out.println("No ticket booked yet for the movie " + movieName);
        }
    }
}

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        // Creating a MovieTicket object
        MovieTicket ticket = new MovieTicket("Inception");

        // Display ticket details before booking
        ticket.displayTicketDetails();

        // Booking a ticket with seat number and price
        ticket.bookTicket("A12", 12.99);

        // Display ticket details after booking
        ticket.displayTicketDetails();
    }
}

