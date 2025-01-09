public class DiscountGiven{
   public static void main(String args[]){
    double fee=125000,discountPercent=10;
    double discount=(fee*discountPercent)/100;
    
    double discountAmount=fee-discount;
    System.out.println("The Discount amount is INR " +  discount + " and final discounted fee is INR " + discountAmount);
}
    
}