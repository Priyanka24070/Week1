public class SpringSeason {

    // Method to check if the date falls in the Spring season
    public static boolean isSpringSeason(int month, int day) {
        // Check for March
        if (month == 3 && day >= 20 && day <= 31) {
            return true;
        }
        // Check for April
        else if (month == 4 && day >= 1 && day <= 30) {
            return true;
        }
        // Check for May
        else if (month == 5 && day >= 1 && day <= 31) {
            return true;
        }
        // Check for June
        else if (month == 6 && day >= 1 && day <= 20) {
            return true;
        }
        // Not in Spring Season
        return false;
    }

    public static void main(String[] args) {
        // Ensure that exactly two command-line arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide two arguments: month and day.");
            return;
        }

        // Parse the command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Validate the month and day
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid date. Please enter a valid month (1-12) and day (1-31).");
            return;
        }

        // Check if it's Spring Season and print the result
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
