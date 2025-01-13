import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        // Check if the year is greater than or equal to 1582
        if (year < 1582) {
            System.out.println("Year should be greater than or equal to 1582.");
            return false;
        }

        // Check for leap year using the given conditions
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true; // It's a leap year
        }
        return false; // It's not a leap year
    }

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        // Input the year from the user
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check if the year is a leap year and display the result
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

                sc.close();
    }
}
