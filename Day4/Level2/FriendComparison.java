import java.util.Scanner;

public class FriendComparison {

    // Method to find the youngest friend
    public static String findYoungest(int[] ages, String[] names) {
        int youngestAge = ages[0];
        String youngestFriend = names[0];

        // Loop through the ages to find the youngest
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = names[i];
            }
        }

        return youngestFriend;
    }

    // Method to find the tallest friend
    public static String findTallest(double[] heights, String[] names) {
        double tallestHeight = heights[0];
        String tallestFriend = names[0];

        // Loop through the heights to find the tallest
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = names[i];
            }
        }

        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create arrays to store the names, ages, and heights
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking user input for ages and heights of the three friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter the height of " + names[i] + " (in meters): ");
            heights[i] = sc.nextDouble();
        }

        // Find the youngest and tallest friend
        String youngest = findYoungest(ages, names);
        String tallest = findTallest(heights, names);

        // Display the results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

                sc.close();
    }
}
