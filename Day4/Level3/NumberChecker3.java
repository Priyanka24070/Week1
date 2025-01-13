public class NumberChecker3 {

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

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversedDigits = new int[digits.length];
        int j = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            reversedDigits[j++] = digits[i];
        }
        return reversedDigits;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseDigits(digits);
        return compareArrays(digits, reversedDigits);
    }

    // Method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        // A duck number must have a non-zero digit but cannot start with a zero.
        if (digits[0] == 0) {
            for (int digit : digits) {
                if (digit != 0) {
                    return true;
                }
            }
        }
        return false;
    }

        public static void main(String[] args) {
        int number = 1021; // Example number for testing
        
        // Store the digits of the number
        int[] digits = storeDigits(number);
        
        // Display the count of digits
        System.out.println("Count of digits: " + countDigits(number));

        // Display the digits array
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Check if the number is a palindrome
        System.out.println("Is Palindrome: " + isPalindrome(number));

        // Check if the number is a Duck number
        System.out.println("Is Duck Number: " + isDuckNumber(number));

        // Reverse the digits array and display it
        int[] reversedDigits = reverseDigits(digits);
        System.out.print("Reversed Digits: ");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");
        }
        System.out.println();
    }
}
