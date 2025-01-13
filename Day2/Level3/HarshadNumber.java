import java.util.Scanner;


class HarshadNumber{
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number to check if a Number is Harshad :");
       int OriginalNumber=sc.nextInt();
       int sum=0,copiedNumber=OriginalNumber;// copy the original number into other variable
       while(OriginalNumber!=0){
           int reminder=OriginalNumber%10; // find the reminder of the Original Number;
           sum+=reminder;// add the reminder value in the sum
           OriginalNumber/=10; // sort the number by 10;
       }
      
       if(OriginalNumber%sum==0){// if the original number is completely divided by sum then,
           System.out.println("Number"+" "+copiedNumber+" "+" is a Harshad Number");// print Yes
       }
       else{
        System.out.println("Number"+" "+copiedNumber+" "+" is  not a Harshad Number");// else print No;




    }
    sc.close();// close the scanner;


}
}
