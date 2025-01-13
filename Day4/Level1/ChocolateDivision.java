import java.util.Scanner;

public class ChocolateDivision {

   
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor; // Chocolates each child gets
        int remainder = number % divisor; // Remaining chocolates
        return new int[]{quotient, remainder}; // Return both values as an array
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Input the number of chocolates and children from the user
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        // Check if the number of children is zero to avoid division by zero
        if (numberOfChildren == 0) {
            System.out.println("The number of children cannot be zero. Please try again.");
        } else {
            // Calculate chocolates per child and remaining chocolates
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Output the results
            System.out.println("Each child will get " + result[0] + " chocolates.");
            System.out.println("The remaining chocolates are: " + result[1]);
        }

        
        sc.close();
    }
}
