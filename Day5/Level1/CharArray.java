
import java.util.Scanner;

public class CharArray { 
    public static char[]literalsUsingCharAtMehtod(String s1){
        char []result=new char[s1.length()]; 
        for(int i=0;i<s1.length();i++){
            result[i]=s1.charAt(i);
        }
        return  result;

    } 
    static  char[]literalsusingNormalMethod(String s1){ 
        return s1.toCharArray();
    }
    static boolean isArraysareEqual(char []result,char[]result2){ 
        for(int i=0;i<result.length;i++){ 
            if(result[i]!=result2[i]){
                return  false;
            }
            

        }
        return true;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the string");
        String st=sc.nextLine(); 
        char final1[]=literalsUsingCharAtMehtod(st); 
        char final2[]=literalsusingNormalMethod(st); 
        boolean result=isArraysareEqual(final1,final2);
       
        
        if(result){
            System.out.println("Both are arrays are equal");
        }
        else{
            System.out.println("Arrays  are not equal");
        }


        
    }

}
