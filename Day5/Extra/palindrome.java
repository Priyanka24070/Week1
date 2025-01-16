import java.util.*;
 class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A string to check palindrome : ");
        String str=sc.nextLine();
   
        int low=0,high=str.length()-1;

        while(low<high)
        {
            if(str.charAt(low)!=str.charAt(high))
            {
                System.out.println("This string is not a palindrome . ");
                break;
            }

            low++;
            high--;
        }


        if(low>=high)
        {
            System.out.println("This string is a palindrome . ");
        }

    }
}
