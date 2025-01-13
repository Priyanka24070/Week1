public class UnitConverter2 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3; // Conversion factor (1 yard = 3 feet)
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333; // Conversion factor (1 foot = 1/3 yards)
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701; // Conversion factor (1 meter = 39.3701 inches)
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254; // Conversion factor (1 inch = 0.0254 meters)
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54; // Conversion factor (1 inch = 2.54 centimeters)
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        // Testing the UnitConverter class methods

        // Test yards to feet
        double yards = 5;
        double feetFromYards = convertYardsToFeet(yards);
        System.out.println(yards + " yards is equal to " + feetFromYards + " feet.");

        // Test feet to yards
        double feet = 15;
        double yardsFromFeet = convertFeetToYards(feet);
        System.out.println(feet + " feet is equal to " + yardsFromFeet + " yards.");

        // Test meters to inches
        double meters = 10;
        double inchesFromMeters = convertMetersToInches(meters);
        System.out.println(meters + " meters is equal to " + inchesFromMeters + " inches.");

        // Test inches to meters
        double inches = 50;
        double metersFromInches = convertInchesToMeters(inches);
        System.out.println(inches + " inches is equal to " + metersFromInches + " meters.");

        // Test inches to centimeters
        double inchesValue = 12;
        double cmFromInches = convertInchesToCentimeters(inchesValue);
        System.out.println(inchesValue + " inches is equal to " + cmFromInches + " centimeters.");
    }
}
