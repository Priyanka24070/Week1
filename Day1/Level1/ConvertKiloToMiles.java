import java.util.Scanner;
public class ConvertKiloToMiles{
    public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    double km= sc.nextDouble();
    double miles=km*0.621;
    System.out.println("The total mile is " + miles + " mile for given " + km + "km");
    sc.close();
}
}  
    
    








