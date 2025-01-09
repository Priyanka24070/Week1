public class ProfitAndPercentage{
    public static void main(String[] args){
    
    // Taking input of cost and selling price.
    int costPrice=129, sellingPrice=191;
    double profit,profitPercentage;
   
    
    //calculate profit and profit percentage.
    profit=sellingPrice-costPrice;
    profitPercentage=(profit / costPrice) * 100;
    
    System.out.println("The cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the profit Percentage is " + profitPercentage);
}
}
