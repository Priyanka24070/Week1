
    class Employee{
    String name;
    String id;
    double salary;

    public void DisplayDetails(String name,String id,double salary){
        System.out.print("Name: "+name +" id: " + id + " salary: "+ salary );
    }
   
    }
    public class Emply{
    public static void main(String[] args){
        Employee emp=new Employee();
        emp.DisplayDetails("Priyanka","0111IT211081",100000);
    }
    }
 