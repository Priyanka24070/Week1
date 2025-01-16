import java.util.Scanner;

public class ToUpperCase {
    static String toUpperValue(String str){// this value give the result of string value to the UpperCase
        String result=""; 
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i); 
            if(ch>='a'&&ch<='z'){
                result+=(char)(ch-32);
            }
            else{
                result+=ch;
            }     
        }
        return result;
    } 
    static String toUpperCaseValue(String str){// the string value are converted to UpperCase value
        return str.toUpperCase();
    } 
    static boolean isEqualorNot(String str1,String str2){// boolean variable that will check both the string area equal or not
        return str1.equals(str2);
    }
    public static void main(String[] args) {
        ToUpperCase TC=new ToUpperCase(); 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the string"); 
        String str=sc.nextLine(); 
        String result1=toUpperCaseValue(str);
        String result2=toUpperValue(str); 
        boolean isSame=isEqualorNot(result1,result2); // call the isEqualorNot Function
        if(isSame){
            System.out.println("String Conversion is Same");

        }
        else{
            System.out.println("String are not Equal");
        }

        
    }

    
}
