import java.util.Scanner;
public class removeDuplicates{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.print("Enter a String :");
String str=sc.nextLine();
 String reverse="";

for(int i=0;i<str.length() ;i++){
char ch=str.charAt(i);

if(reverse.indexOf(ch)== -1){
reverse=reverse+ch;
}
}

System.out.println(reverse);
sc.close();
}
}