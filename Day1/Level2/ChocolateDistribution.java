import java.util.Scanner;

public class ChocolateDistribution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of chocolates
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        // Input: Number of children
        System.out.print("Enter the total number of children: ");
        int numberOfChildren = sc.nextInt();

        // Calculate chocolates each child gets
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;

        // Calculate remaining chocolates
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Output results
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);

        sc.close();
    }
}
