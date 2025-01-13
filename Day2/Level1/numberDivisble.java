import java.util.Scanner;
    class numberDivisble{
    public static void main(String[]args){
        System.out.println("Enter the value to check the divisibility");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String result=(number%5==0)?"Yes":"No";// terniary operator; 
        System.out.println("Is the number"+" "+number+" "+" is divisble by 5?"+result);


    }
}