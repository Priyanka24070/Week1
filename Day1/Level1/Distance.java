import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        //takes input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your distance in feet : ");
        double distanceinfeet = sc.nextDouble();
        // converting in yards
        double yards=distanceinfeet/3;
        // converting in miles
        double miles=yards*0.000568;
        System.out.println("the distance in yards : " + yards + " while in miles is : " + miles);
        sc.close();
}
}
