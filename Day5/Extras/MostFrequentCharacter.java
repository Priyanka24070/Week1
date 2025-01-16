import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find the most frequent character in a string
    public static char findMostFrequentCharacter(String str) {
        // Create an array to store the frequency of each character (assuming ASCII characters)
        int[] freq = new int[256];

        // Convert string to char array and calculate the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // Find the character with the highest frequency
        int maxFreq = 0;
        char mostFrequentChar = ' ';

        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                mostFrequentChar = (char) i;
            }
        }

        return mostFrequentChar;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input string from the user
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Call the method to find the most frequent character
        char mostFrequentChar = findMostFrequentCharacter(str);

        // Display the result
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");

        scanner.close();
    }
}
