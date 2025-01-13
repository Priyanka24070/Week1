
import java.util.Scanner;

class Calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the First Number");; 
        double number1=sc.nextDouble(); 
        System.out.println("Enter the Second Number");
        double number2=sc.nextDouble();
        System.out.println("Choose an opeator(+,-,*,/)"); 
        char operator=sc.next().charAt(0);  
        double result=0;
        switch (operator) {
            case '+':result=number1+number2;
            System.out.println("The addition is "+" "+result);

                
                break;
                case '-':result=number1-number2;
            System.out.println("The substraction is "+" "+result);

                
                break;  
                case '*':result=number1+number2;
            System.out.println("The Multiplication is "+" "+result);

                
                break;  
                case '/':result=number1/number2;
            System.out.println("The Divison is "+" "+result);

                
                break;  
                
                
                

        
            default: 
            System.err.println("Invalid Operator entered by User");
                break;
        } 
        sc.close();


        
    }
}