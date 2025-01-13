import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

                    // Calculate the maximum number of handshakes
            int maxHandshakes = calculateHandshakes(numberOfStudents);

                        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + maxHandshakes + ".");
        

   
        sc.close();
    }
}
