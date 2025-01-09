import java.util.Scanner;
public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double heightCm = sc.nextDouble();

        // Convert centimeters to inches
        double totalInches = heightCm / 2.54;

        // Convert inches to feet and remaining inches
        int feet = (int) (totalInches / 12); 
        double inches = totalInches % 12; 

        // Display the result
        System.out.printf("Your height in cm is " + heightCm + " while in feet is " +  feet + " and inches is " + inches);

        sc.close();
    }
}
