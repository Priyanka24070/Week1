import java.util.*;
public  class reverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        int start=0,end=ch.length-1;

        while(start<end)
        {
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
           
            start++;
            end--;
        }

        String reversed= new String(ch);

        
            System.out.println(reversed);
      

    }
}
