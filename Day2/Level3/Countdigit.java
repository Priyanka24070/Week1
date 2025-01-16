import java.util.Scanner; 
class Countdigit{
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter the Digit");  // Enter the Digit from User;
    int number=sc.nextInt(); 
    int copiedNumber=number;// copy the original number
    int count=0; 
    while(number!=0){// Logic
        count++;
        number/=10;
    }
    System.out.println("Total digit in the "+copiedNumber+" "+"is"+ " "+count);// result;

}
}