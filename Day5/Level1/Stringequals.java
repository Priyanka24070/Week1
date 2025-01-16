
import java.util.Scanner;

class StringEqual{ 
    // 
   static boolean isEqual(String s1,String s2){// cheking the string using normal method
        if(s1.equals(s2)){// 
            return true;
        } 
        else{
            return false;
        }
    } 
    static boolean isEqual2(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        } 
        for(int i=0;i<s1.length();i++){// Cheking the String Using using Charat method
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            } 
        }
        return true;
    }
    public static void main(String[] args) { 
        StringEqual s=new StringEqual(); 
        Scanner sc=new Scanner(System.in);// Taking the input from user
        System.out.println("Enter string 1"); 
        String st1=sc.nextLine(); // Take string 1
        System.out.println("Enter string2"); 
        String st2=sc.nextLine(); // Take string 2
        boolean value=isEqual(st1,st2); // call the function 1
        boolean value2=isEqual2(st1,st2); // call the function 2
        if(value==value2){ // check if both boolean values
            System.out.println("Strings are equal");

        }
        else{
            System.out.println("Strings are not equal");
        }

        
    }

}