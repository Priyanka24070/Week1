import java.util.Scanner;

public class SimpleInterest {

    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Input values for principal, rate, and time
        System.out.print("Enter the Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the Rate of Interest : ");
        double rate = sc.nextDouble();

        System.out.print("Enter the Time period : ");
        double time = sc.nextDouble();

        // Calculate the Simple Interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Output the result
        System.out.println("The Simple Interest is " +  simpleInterest  + " for Principal " +  principal + ", Rate of Interest " +  rate + " and Time " + time );


        sc.close();
    }
}
