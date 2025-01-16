import java.util.Scanner;
    
class smallestOfthreeNumbers {   
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the first number1");
    int number1=sc.nextInt(); 
    System.out.print("Enter the second number");
    int number2=sc.nextInt();
    System.out.print("Enter the third number");
    
    int number3=sc.nextInt();
    String result="Yes";
    if(number1<number2&&number1<number3){
        result="Yes";
        
    }
    else{
        result="No";
    } 
    System.out.println("Is the first number the smallest?"+result);


    

    
    
}
}
