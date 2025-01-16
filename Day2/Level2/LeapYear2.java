
import java.util.Scanner;
public class LeapYear2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (1582 or later): ");
        int year = scanner.nextInt();

           // Version using single if-statement with logical operators
        boolean isLeapYear = (year >= 1582 &&
                              year % 4 == 0 &&
                              (year % 100 != 0 || year % 400 == 0));

        System.out.println((isLeapYear ? year + " is a Leap Year." :
                            year + " is not a Leap Year."));
    }
}
