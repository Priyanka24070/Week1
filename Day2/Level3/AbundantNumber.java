import java.awt.font.NumericShaper;
import java.util.Scanner;

class AbundantNumber{
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the number to check if the NUmber is Abundant or Not:"); 
        int number=sc.nextInt(); 
        int sum=0; 
        for(int i=1;i<number;i++){ 
            if(number%i==0){
                sum+=i;
            }
        }
        if(sum>number){
            System.out.println("Number"+" "+number+" "+" is a Abundant Number");
        }
        else{
            System.out.println("Number"+" "+number+" "+" is a Abundant Number");
        }
        sc.close();
    }
        }
        