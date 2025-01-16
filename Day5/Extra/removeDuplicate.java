import java.util.*;
 class removeDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str=sc.nextLine();

        String result="";
        int[] arr=new int[256];


        for(int i=0;i<str.length();i++)
        {
            if(arr[str.charAt(i)]==0 || str.charAt(i)==' ')
            {
                result+=str.charAt(i);
                arr[str.charAt(i)]++;
            }
        }

        System.out.println( result);

    }
}
