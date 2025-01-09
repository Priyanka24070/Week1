public class SamMarks{
   public static void main(String[] args){
      int mathsMarks=94;
      int phyMarks=95;
      int chemMarks=96;
  
      int totalMarksObtained= mathsMarks+phyMarks+chemMarks;
       
      int totalMarksPerSubject=100;
      
      double averagePercentage = (double) totalMarksObtained / (3 * totalMarksPerSubject) * 100;

      System.out.println("Sam's average marks in PCM is " + averagePercentage);
 }
} 