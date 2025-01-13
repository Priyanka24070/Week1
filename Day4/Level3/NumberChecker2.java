public class NumberChecker2 {

        public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of a number using the digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number using the digits array
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number using the digits array
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sumOfDigits = sumOfDigits(digits);
        return number % sumOfDigits == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // 10 digits (0-9)
        
        for (int digit : digits) {
            frequency[digit][0] = digit; // store the digit
            frequency[digit][1]++; // increment the frequency
        }
        
        return frequency;
    }

    // Method to print frequency table of digits
    public static void printDigitFrequency(int[][] frequency) {
        System.out.println("Digit | Frequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + "     | " + frequency[i][1]);
            }
        }
    }

    // Main method to test the utility class
    public static void main(String[] args) {
        int number = 21; // Example number
        
        // Store the digits of the number
        int[] digits = storeDigits(number);
        
        // Display the number of digits
        System.out.println("Count of digits: " + countDigits(number));
        
        // Find the sum of digits
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        
        // Find the sum of squares of digits
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        
        // Check if the number is a Harshad number
        System.out.println("Is Harshad Number: " + isHarshadNumber(number, digits));
        
        // Find the frequency of digits
        int[][] frequency = findDigitFrequency(digits);
        
        // Print frequency of digits
        printDigitFrequency(frequency);
    }
}
