import java.util.Scanner;

public class LowerCase {
    static String toLowerValue(String str){// this value give the result of string value to the UpperCase
        String result=""; 
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i); 
            if(ch>='A'&&ch<='Z'){
                result+=(char)(ch+32);//ASCII Value is changed 
            }
            else{
                result+=ch;
            }
        }
        return result;
    } 
    static String toLowerCaseValue(String str){// the string value are converted into  LowerCase Letters
        return str.toLowerCase();
    } 
    static boolean isEqualorNot(String str1,String str2){
        return str1.equals(str2);
    }
    public static void main(String[] args) {
        ToUpperCase TC=new ToUpperCase(); 
        Scanner sc=new Scanner(System.in); // Scanner class to take the input from the usert
        System.out.println("Enter the string"); 
        String str=sc.nextLine(); 
        String result1=toLowerValue(str);// call the string that return the string using ASCII values;
        String result2=toLowerCaseValue(str); // call the string that return the string conversion using the normal values;
        System.out.println(result1);
        boolean isSame=isEqualorNot(result1,result2); // boolean value to check the string are equal or not
        if(isSame){
            System.out.println("String value converted is Same");//

        }
        else{
            System.out.println("String are not Equal");
        }

        
    }

    
}
