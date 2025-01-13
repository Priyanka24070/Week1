public class UnitConverter {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371; // Conversion factor
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934; // Conversion factor
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084; // Conversion factor
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048; // Conversion factor
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        // Testing the UnitConverter class methods

        // Test km to miles
        double km = 10;
        double miles = convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + miles + " miles.");

        // Test miles to km
        double milesValue = 6.2;
        double kmResult = convertMilesToKm(milesValue);
        System.out.println(milesValue + " miles is equal to " + kmResult + " kilometers.");

        // Test meters to feet
        double meters = 5;
        double feet = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + feet + " feet.");

        // Test feet to meters
        double feetValue = 16.4;
        double metersResult = convertFeetToMeters(feetValue);
        System.out.println(feetValue + " feet is equal to " + metersResult + " meters.");
    }
}
