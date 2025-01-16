import java.util.*;
public class vowel_cons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        int vowel=0,consonant=0;
        String str= sc.nextLine();
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a' ||  str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'  )
            {
                vowel++;
            }
            else if(str.charAt(i)==' ')
            {

            }
            else
            {
                consonant++;
            }
        }

        System.out.println("The number of vowels in tia string is : " + vowel + " and consonant is  : " + consonant);

    }
}
