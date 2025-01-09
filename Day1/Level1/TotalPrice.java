import java.util.Scanner;
public class TotalPrice {
    public static void main(String[] args) {
        //takes input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter your price: ");
        int unitprice = sc.nextInt();
        // calculating total price
        double price=unitprice*quantity;
        //printing output
        System.out.println("the total purchase price is INR : " + price + " if the quantity : " + quantity + " and unit price is INR : " + unitprice);
        sc.close();
}
}
