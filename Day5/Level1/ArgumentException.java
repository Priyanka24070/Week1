
import java.util.Scanner;

class ArgumentException{
    static void Argument(String str,int start,int end){
        String result=""; 
        
        try { 
            result+=str.substring(end+1,end);
           // System.out.println(result);
           System.out.println(result);
            
        } catch (Exception e) {
            throw new IllegalArgumentException("Illegal Argument Exception");
            
            //System.out.println("Illegal Argument Exception");
        }
    } 
    public static void main(String[] args) {
        ArgumentException ae=new ArgumentException(); 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the string value"); 
        String finalString=sc.nextLine(); 
        System.out.println("Enter the first number"); 
        int start=sc.nextInt(); 
        System.out.println("Enter the end index");
        int end=sc.nextInt();
        Argument(finalString, start,0);
        sc.close();
    }
}