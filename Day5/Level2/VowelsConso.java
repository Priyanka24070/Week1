
import java.util.Scanner;

public class VowelsConso{
    public static char charLetters(char ch){
        if(ch>='A'&&ch<='Z'){
            ch=(char)(ch+32);
            
        }
        return ch;
    } 
    public static String charCheckVowelorConsonent(char ch){
        ch=charLetters(ch);  
        if(ch>='a'&&ch<='z'){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        return "Vowels";
        else 
        return "Consonent";
        } 
        return "Nothing";

    

    
}
public static int[]findVowelConsonent(String str){ 
    int vowel=0; 
    int consonent=0; 
    for(int i=0;i<str.length();i++){ 
        char ch=str.charAt(i); 
        if(charCheckVowelorConsonent(ch).equals("Vowels"))
        vowel++; 
        else if(charCheckVowelorConsonent(ch).equals("consonent")) 
        consonent++;

    }
    return new int[]{vowel,consonent};
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter the String"); 
    String input=sc.nextLine();
    int []finalresult=findVowelConsonent(input); 
    System.out.println("The number of Vowels in the String is "+finalresult[0]); 
    System.out.println("The number of Consonent in the String is "+finalresult[1]);

}
