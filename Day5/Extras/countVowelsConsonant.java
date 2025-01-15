import java.util.Scanner;
public class countVowelsConsonant{
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
System.out.print("Enter a String:");
string input=new nextLine();
//convert all the characters into lowercase
input=input.toLowerCase();
int vowels=0, consonants=0;

for(int i=0;i<input.length();i++){
   char ch=input.charAt(i);
//check if character is a vowel
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            // Check if the character is a consonant
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
//Display the result
System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
sc.close();
    }
}