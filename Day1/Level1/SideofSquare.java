import java.util.Scanner;
public class SideofSquare {
    public static void main(String[] args) {
        // takes input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double parameter = sc.nextDouble();
        // calculating length of side
        double length = parameter/4;
    // print the answer
    System.out.println("The lenghth of side is : " + length + " whose parameter is : " + parameter);
    sc.close();
}
}

