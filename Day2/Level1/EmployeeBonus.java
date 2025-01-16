import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input salary and years of service
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter the years of service: ");
        int yearsOfService = scanner.nextInt();

        // Check if eligible for bonus
        if (yearsOfService > 5) {
            double bonus = 0.05 * salary;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus for employees with less than or equal to 5 years of service.");
        }
    }
}