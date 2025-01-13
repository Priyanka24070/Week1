import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate the wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        // Input the temperature and wind speed from the user
        System.out.print("Enter the temperature : ");
        double temperature = sc.nextDouble();

        System.out.print("Enter the wind speed : ");
        double windSpeed = sc.nextDouble();

        // Validate wind speed (must be >= 2.0)
        if (windSpeed < 2.0) {
            System.out.println("Wind speed must be at least 2.0 mph for valid wind chill calculation.");
        } else {
            // Calculate the wind chill
            double windChill = calculateWindChill(temperature, windSpeed);

            // Output the result
            System.out.printf("The wind chill temperature is: %.2f°F%n", windChill);
        }

                sc.close();
    }
}
