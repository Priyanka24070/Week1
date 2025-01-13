import java.util.Random;

public class RandomValues {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        Random rand = new Random();
        int[] randomNumbers = new int[size];
        
        for (int i = 0; i < size; i++) {
            // Generate a random 4-digit number between 1000 and 9999
            randomNumbers[i] = 1000 + rand.nextInt(9000);
        }
        
        return randomNumbers;
    }

    // Method to find the average, min, and max of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0;

        // Calculate the sum, min, and max values
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Calculate the average
        double average = sum / numbers.length;

        // Return the average, min, and max as an array
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        // Generate an array of 5 4-digit random numbers
        int[] randomNumbers = generate4DigitRandomArray(5);
        
        // Display the random numbers
        System.out.println("Generated Random Numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Find the average, min, and max
        double[] result = findAverageMinMax(randomNumbers);
        
        // Display the results
        System.out.println("Average: " + result[0]);
        System.out.println("Minimum Value: " + result[1]);
        System.out.println("Maximum Value: " + result[2]);
    }
}
