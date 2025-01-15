import java.util.Scanner;

public class ReverseStringUsingSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //enter a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert the string to a character array
        char[] charArray = input.toCharArray();

                int start = 0;
        int end = charArray.length - 1;

        // Swap characters until the pointers meet in the middle
        while (start < end) {
            // Swap the characters at start and end
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move the pointers closer to the center
            start++;
            end--;
        }

        // Convert the character array back to a string
        String reversed = new String(charArray);

        // Display the reversed string
        System.out.println("Reversed string: " + reversed);
    }
}
