import java.util.Scanner;

public class CalendarDisplay {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];  // month is 1-based
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Method to get the number of days in a month
    public static int getNumberOfDays(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;  // February has 29 days in a leap year
        }
        return daysInMonth[month - 1];  // months are 1-based
    }

    // Method to calculate the first day of the month (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (1 + x + (31 * m) / 12) % 7;  // 1 is the day for the 1st of the month
        return d;
    }

    // Method to display the calendar for the given month and year
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Display the header
        System.out.println("       " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Display the first row of the calendar (initial spaces for the first day)
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");  // Four spaces for each empty day before the first day
        }

        // Display the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);  // Print day with right alignment in a width of 3
            if ((firstDay + day) % 7 == 0) {  // Move to the next line after Saturday
                System.out.println();
            }
        }
        System.out.println();  // Move to the next line after displaying all days
    }

    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Display the calendar for the given month and year
        displayCalendar(month, year);
    }
}
