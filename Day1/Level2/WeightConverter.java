import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = sc.nextDouble();

        // Convert to kilograms
        double weightInKg = weightInPounds / 2.2;

        // Print the result
        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kilograms is " + weightInKg);

        sc.close();
    }
}
