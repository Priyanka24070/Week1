import java.util.*;
public class toggle_Case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        String ans = "";

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                ans += (char)(str.charAt(i) - 32);
            }
            else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                ans += (char)(str.charAt(i) + 32);
            }
        }

        System.out.println(ans);

    }
}
