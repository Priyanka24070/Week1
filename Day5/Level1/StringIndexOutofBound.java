
import java.util.Scanner;

public class StringIndexOutofBound {
    static void result(String str){
        String finalresult="";  
        finalresult+=str; 
        String result="";
        result+=finalresult.charAt(finalresult.length()+1); 
        try { // try if the result value area caught
            System.out.println(result);
            
        } catch (Exception e) {// catch the exception
            System.out.println("IndexOutofBoundException");
        }


    }
    public static void main(String[] args) {
        StringIndexOutofBound sb=new StringIndexOutofBound(); 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the String value");
        String value=sc.nextLine();
        result(value); 
       // System.out.println(finalresult);// this will call the stringIndexOutOfBound Exception


    }
    
}
