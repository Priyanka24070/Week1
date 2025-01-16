
import java.util.Scanner;

public class NullPointer { 
    static void result(){ // method to create the nullpointer exception
        String result=null; 
        System.out.println(result.length());
    }
    public static void main(String[] args) {// main class of the java
        Scanner sc=new Scanner(System.in); // scanner class for performing the Input value from the user
        result();

    }
}