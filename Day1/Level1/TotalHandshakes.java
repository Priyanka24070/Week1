import java.util.Scanner;
public class TotalHandShakes {
    public static void main(String[] args) {
        //takes input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        // calculating total handshakes
        double totalShakes=(n*(n-1))/2;
        //printing output
        System.out.println("the total possible handshakes are : " + totalShakes);
        sc.close();
}
}
