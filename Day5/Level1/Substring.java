import java.util.Scanner;

public class Substring { // Substring class
   static  String isequalusingCharAtMethod(String s1,int s,int e){// check the substring using charAt method
        String result=""; 
        for(int i=s;i<e;i++){
            result+=s1.charAt(i);
        }
        return result;
    } 
   static String isequalusingSubstringMethod(String s1,int s,int e){// check the substring using inbuilt method
        String result2=""; 
        result2=s1.substring(s,e);  
        return result2;
    } 
    static boolean isequal3(String result1,String result2){ // boolean method to check the validity 
         
        return result1.equals(result2);
    }
    public static void main(String[] args) {
        Substring s=new Substring(); // object of Substring class
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the String Value"); 
        String s1=sc.nextLine();
        int start=sc.nextInt(); 
        int end=sc.nextInt(); 
        String result1=isequalusingCharAtMethod(s1, start, end); 
        System.out.println("The Substring of the String "+s1+" "+" is "+result1); 
       
        String result2=isequalusingSubstringMethod(s1, start, end);
        System.out.println("The Substring of the String "+s1+" is "+resul2);

        boolean result=isequal3(result1,result2); // boolean method to check ig the substring are equal or not
        if(result){
            System.out.println("Substring are equal");
        }
        else{
            System.out.println("Substring are not equal");
        } 
        sc.close();


        
    }

    
}
