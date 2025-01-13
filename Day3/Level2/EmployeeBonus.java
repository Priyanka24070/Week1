import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

        // Define constants
        final int EMPLOYEE_COUNT = 10;
        final double BONUS_RATE_MORE_THAN_5_YEARS = 0.05; // 5%
        final double BONUS_RATE_LESS_THAN_5_YEARS = 0.02; // 2%

        // Define arrays and variables
        double[] salaries = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonuses = new double[EMPLOYEE_COUNT];
        double[] newSalaries = new double[EMPLOYEE_COUNT];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Loop to take input for salary and years of service
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            // Input salary
            while (true) {
                System.out.print("Salary: ");
                double salary = scanner.nextDouble();
                if (salary > 0) {
                    salaries[i] = salary;
                    totalOldSalary += salary; // Add to total old salary
                    break;
                } else {
                    System.out.println("Invalid salary! Please enter a positive value.");
                }
            }

            // Input years of service
            while (true) {
                System.out.print("Years of Service: ");
                double years = scanner.nextDouble();
                if (years >= 0) {
                    yearsOfService[i] = years;
                    break;
                } else {
                    System.out.println("Invalid years of service! Please enter a non-negative value.");
                }
            }
        }

        // Loop to calculate bonus, new salary, and totals
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            double bonusRate = yearsOfService[i] > 5 ? BONUS_RATE_MORE_THAN_5_YEARS : BONUS_RATE_LESS_THAN_5_YEARS;
            bonuses[i] = salaries[i] * bonusRate; // Calculate bonus
            newSalaries[i] = salaries[i] + bonuses[i]; // Calculate new salary
            totalBonus += bonuses[i]; // Update total bonus
            totalNewSalary += newSalaries[i]; // Update total new salary
        }

        // Print results
        System.out.println("\nEmployee Details and Bonuses:");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.printf("Old Salary: %.2f, Years of Service: %.1f, Bonus: %.2f, New Salary: %.2f%n",
                    salaries[i], yearsOfService[i], bonuses[i], newSalaries[i]);
        }

        System.out.println("\nSummary:");
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

     
        scanner.close();
    }
}
