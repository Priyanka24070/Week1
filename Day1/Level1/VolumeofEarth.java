public class VolumeofEarth {
    public static void main(String[] args) {
        // Earth's radius in kilometers
        double radiusKm = 6378;

        // Calculate volume in cubic kilometers
        double volume = (4.0 / 3.0) * 3.14 * Math.pow(radiusKm, 3);

        // Convert to cubic miles
        double mile = volume * 0.62137;

        // Print results
        System.out.println("The volume of Earth in cubic kilometers is " + volume + " and in cubic miles is " + mile);
            
    }
}


















      
      