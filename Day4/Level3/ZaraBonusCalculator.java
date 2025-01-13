import java.util.Random;

public class ZaraBonusCalculator {

    // Method to generate random salary and years of service
    public static int[][] generateEmployeeData(int numEmployees) {
        Random rand = new Random();
        int[][] data = new int[numEmployees][2]; // 0th column for salary, 1st column for years of service

        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // 5-digit random salary between 10000 and 99999
            data[i][1] = 1 + rand.nextInt(20); // Random years of service between 1 and 20
        }

        return data;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateNewSalariesAndBonuses(int[][] employeeData) {
        double[][] results = new double[employeeData.length][3]; // 0th column for old salary, 1st column for new salary, 2nd column for bonus

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];

            // Calculate bonus
            double bonus = (yearsOfService > 5) ? oldSalary * 0.05 : oldSalary * 0.02;

            // Calculate new salary
            double newSalary = oldSalary + bonus;

            // Store the results
            results[i][0] = oldSalary;
            results[i][1] = newSalary;
            results[i][2] = bonus;
        }

        return results;
    }

    // Method to calculate the sum of old salary, new salary and total bonus
    public static double[] calculateTotalSalariesAndBonus(double[][] salaryData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < salaryData.length; i++) {
            totalOldSalary += salaryData[i][0];
            totalNewSalary += salaryData[i][1];
            totalBonus += salaryData[i][2];
        }

        return new double[]{totalOldSalary, totalNewSalary, totalBonus};
    }

    // Method to display the results in a tabular format
    public static void displayResults(double[][] salaryData, double[] totals) {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Employee", "Old Salary", "New Salary", "Bonus");
        System.out.println("---------------------------------------------------------------------------------");

        for (int i = 0; i < salaryData.length; i++) {
            System.out.printf("Emp-%d     %-10d %-10.2f %-10.2f\n", i + 1, (int) salaryData[i][0], salaryData[i][1], salaryData[i][2]);
        }

        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%-10s %-10.2f %-10.2f %-10.2f\n", "Total", totals[0], totals[1], totals[2]);
        System.out.println("---------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int numEmployees = 10; // Total employees in Zara
        int[][] employeeData = generateEmployeeData(numEmployees);

        // Calculate the new salary, old salary, and bonus for each employee
        double[][] salaryData = calculateNewSalariesAndBonuses(employeeData);

        // Calculate the total old salary, new salary, and total bonus
        double[] totals = calculateTotalSalariesAndBonus(salaryData);

        // Display the results in tabular format
        displayResults(salaryData, totals);
    }
}
