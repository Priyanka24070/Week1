import java.util.Scanner;

public class splitString { 
    public static int lengthOfString(String str){ // method to count the length of string without using the length method;
        int count=0; 
        for(;;){ 
            try { 
                str.charAt(count);
                    count++;
                

                
            } catch (StringIndexOutOfBoundsException e) { 
               // System.out.println("The Error Ocuured at the runtime is "+e.getMessage());
                return count;
                
            }
            return 0;
        }
    

    } 
    public static int lengthofArray(String str2){// length of array using charat method
        int n=lengthOfString(str2);
        int counter=0;
        for(int i=0;i<n;i++){
            if(str2.charAt(i)==' '){
                counter++;
            }
        } 
        return counter+1;
    } 
    public static String[]SplitString(String str3){
        int lengthOfString=lengthOfString(str3);
        String result[]=new String[lengthofArray(str3)];
        String temp="";  
        int index=0;
        for(int i=0;i<lengthOfString;i++){
            if(str3.charAt(i)!=' '){ 
                temp+=str3.charAt(i);
            } 
            else{ 
                result[index]=temp;
            }

        }
        return result;

    } 
    public static boolean isBothArrayareequal(String str4,String str5){
        if(str4.length()!=str5.length()){
            return false;
        }
        return true;
    } 
    public static void main(String[] args) {
        splitString st=new  splitString(); 
        Scanner sc=new Scanner(System.in);// take user input;
        String value=sc.nextLine();
        String[]str=SplitString(value);
        System.out.println("Both the Method "+value+" "+value.split(value).toString()+" "+"are equal");

    
}
}

