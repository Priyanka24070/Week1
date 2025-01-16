
import java.util.Scanner;

public class Vowelconsonentmodified {
    public static char charLetter(char ch){
        if(ch>='A'&&ch<='Z'){
            ch=(char)(ch+32);
        }
        return ch;
    } 
    public static String isVowelorConsonet(char ch){ 
        ch=charLetter(ch);
        if(ch>='a'&&ch<='z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            return "Vowel";
            else
            return "Consonent";
        }
        return "Nothing";
        
    }
    public static String[][] findVowelsandConsonent(String s){
        String result[][]=new String[s.length()][2]; 
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            result[i][0]=String.valueOf(ch); 
            result[i][1]=isVowelorConsonet(ch);
        }
        return result;
    }
    public static void displayResult(String[][] result){
        System.out.println("Character\tType");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i][0]+"\t\t"+result[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String Value"); 
        String str=sc.nextLine(); 
        String[][]result=findVowelsandConsonent(str); 
        displayResult(result);

    }


    //return ch;
    
}
