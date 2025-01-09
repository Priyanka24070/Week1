import java.util.Scanner;
class TravelComputation {
   
   public static void main(String[] args) {

         String name = "Eric";
         String fromCity = "Chennai", viaCity = "Velore", toCity = "Bangalore";

         Scanner sc = new Scanner(System.in);
         double distanceFromToVia = sc.nextDouble();

         int timeFromToVia =sc.nextInt();


         double distanceViaToFinalCity =sc.nextDouble();
      
         int timeViaToFinalCity =sc.nextInt();
         double totalDistance = distanceFromToVia + distanceViaToFinalCity;

         int totalTime = timeFromToVia + timeViaToFinalCity;


      // Print the travel details
      System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and " + "the Total Time taken is " + totalTime + " minutes");
         sc.close();


   }
}
