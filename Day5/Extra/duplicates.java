import java.util.*;
class duplicates {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String :  ");
        String str=sc.nextLine();
        boolean flag=false;

        for(int i=0;i<str.length()-1;i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    System.out.println("This is a duplicate string . \n");
                    flag=true;
                    break;
                }
            }
            if(flag==true)
            {
                break;
            }
        }

        if(flag==false)
        {
            System.out.println("This is not a duplicate string . \n");
        }


    }
}
