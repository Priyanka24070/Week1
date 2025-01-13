import java.util.Random;

public class FootballTeamHeights {

    // Method to generate 3-digit random heights for players in the range 150 to 250 cm
    public static int[] generateRandomHeights(int size) {
        Random rand = new Random();
        int[] heights = new int[size];
        
        for (int i = 0; i < size; i++) {
            // Generate a random height between 150 and 250
            heights[i] = 150 + rand.nextInt(101); // 150 + random number from 0 to 100
        }
        
        return heights;
    }

    // Method to calculate the sum of all the heights in the array
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double calculateMean(int[] heights) {
        int sum = calculateSum(heights);
        return sum / (double) heights.length;  // Convert to double for accurate division
    }

    // Method to find the shortest height
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        // Generate an array of 11 random heights
        int[] heights = generateRandomHeights(11);
        
        // Display the generated heights
        System.out.println("Heights of players in the football team (in cm): ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();
        
        // Calculate and display the shortest, tallest, and mean height
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);
        double mean = calculateMean(heights);
        
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
        System.out.println("Mean Height: " + mean + " cm");
    }
}
