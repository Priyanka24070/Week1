import java.util.Scanner;

class LengthofString{
    static int lengthOfString(String str){ 
        int count=0;
        for(;;){
            try{
                str.charAt(count);
                count++;
            }catch(Exception e){
                break;
            } 
            catch(Error e){
                System.out.println("String out of Bound Exception"+e.getMessage());
            }

        }
        return count;

    }
    public static void main(String[] args) {
        LengthofString s=new LengthofString();
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the string");  
        String sr=sc.nextLine(); 
        System.out.println("Length of the string is "+s.lengthOfString(sr));
    }
}