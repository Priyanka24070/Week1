import java.util.Scanner;
public class Discount{
   public static void main(String args[]){
    double fee,discount;
    Scanner sc=new Scanner(System.in);

    // take input for fee and university discount  
    fee= sc.nextDouble();    
    discount=sc.nextDouble();

    //calculation    
    double discountAmount=(fee*discount)/100;
    double discountedAmount=fee-discount;

    //print final statement
    System.out.println("The Discount amount is INR " +  discountAmount + " and final discounted fee is INR " + discountedAmount);
}
    
}
