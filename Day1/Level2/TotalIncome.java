import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take salary and bonus as input from the user
        System.out.print("Enter the salary in INR: ");
        double salary = sc.nextDouble();

        System.out.print("Enter the bonus in INR: ");
        double bonus = sc.nextDouble();

        // Calculate total income by adding salary and bonus
        double totalIncome = salary + bonus;

        // Print the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);

        sc.close();
    }
}
