public class ArrayOutOfBound {
    public static void checkArrayBoundofException(int arr[]){
        try {
            int num=arr[9]; 
            System.out.println("The Index value of the array is "+num);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index element is out of Bound");
        }
        catch(RuntimeException e){
            System.out.println("The value of the Exception is "+e.getMessage());
        }
    } 
    public static void main(String[] args) {
        ArrayOutOfBound AB=new ArrayOutOfBound(); 
        int value[]=new int[6]; 
        try{
            checkArrayBoundofException(value);
        } 
        catch(Exception e){
            System.out.println("The result of the Exception is "+e.getMessage());
        }

        }
        
    }
