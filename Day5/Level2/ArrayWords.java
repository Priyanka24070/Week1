
import java.util.Scanner;

public class ArrayWords {
    // split without split InBuilt Method; 
    public static String[] split(String str){
        int n=str.length();
        int count=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        String result[]=new String[count+1];
        String temp="";
        int index=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)!=' '){
                temp+=str.charAt(i);
            }
            else{
                result[index]=temp;
                temp="";
                index++;
            }
        }
        return result;
    }
    public static int lengtofString(String str2){// calculate the length of string without using the length method;
        int count=0;
        for(int i=0;i<str2.length();i++){
            if(str2.charAt(i)==' '){
                count++;
            }
        }
        return count+1;

    }
public static void displayresult(String value [][]){// display the result;
    for(String it[]:value){
        for(int i=0;i<it.length;i++){
            System.out.println(it[i]);
        }
        System.out.println();
    } 
    System.out.println();
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);// take user input;
    System.out.println("Enter the String");// take user input;
    String value1=sc.nextLine(); 
    int lengthOfString=lengtofString(value1);// calculate the length of string;
    String ans[][]=new String[lengthOfString][2]; // create the 2d array;
    String []arr=split(value1);
    for(int i=0;i<arr.length;i++){// store the value in 2d array;
        int temp=arr[i].length();
        ans[i][0]=arr[i];
        ans[i][1]=String.valueOf(temp);
        }
        displayresult(ans);// display the result;
        sc.close();// close the scanner;



}

    
}
