import java.util.*;
public class longest_Word {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str=sc.nextLine();
        int large=0;
        String ans="";
        String[] sp_str=str.split(" ");

        for(String i:sp_str)
        {
           if(large<i.length())
           {
              large=i.length();  
              ans=i;
           }
        }

        System.out.println(ans);
    }

    
}
