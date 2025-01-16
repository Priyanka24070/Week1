
import java.util.Scanner;

public class LeadingTrailing { 
    public static int[] startingAndEnding(String str){
        int start=0; 
        int end=str.length()-1; 
        // fint the leading space index 
        while(start<=end&&str.charAt(start)==' '){
            start++;
        } 
        // find thr traling space index of the string  
        while(end>=start&&str.charAt(end)==' '){
            end--; 

        }
        return new int[]{start,end};
    } 
    public static String substringOftheString(String str,int s,int e){
        StringBuilder sb=new StringBuilder(); 
        for(int i=s;i<=e;i++){
            sb.append(str.charAt(i));
        } 
        return sb.toString();


    } 
    public static boolean comparetheString(String str1,String str2){
        if(str1.length()!=str2.length()) {
        return false;
        }
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)) 
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the String");  
        String str=sc.nextLine(); 
        int []index=startingAndEnding(str); 
        int start=index[0];
        int end=index[1];
        String trimmedUsingCharAt = substringOftheString(str, start, end);
        
        // Get the trimmed substring using the built-in trim() method
        String trimmedUsingTrim = str.trim();
        
        // Compare the two trimmed strings
        boolean areEqual = comparetheString(trimmedUsingCharAt, trimmedUsingTrim);
        
        // Display the results
        System.out.println("Trimmed string using charAt(): " + trimmedUsingCharAt);
        System.out.println("Trimmed string using built-in trim(): " + trimmedUsingTrim);
        System.out.println("Are the trimmed strings equal? " + areEqual);
    }
       

    }