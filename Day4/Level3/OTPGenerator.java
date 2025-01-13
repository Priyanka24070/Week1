import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {

    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        // Generate a random number between 100000 and 999999 (inclusive)
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to ensure the OTP numbers are unique
    public static boolean areOTPsUnique(int[] otpArray) {
        // Use a HashSet to store OTPs and check if they are unique
        Set<Integer> otpSet = new HashSet<>();
        
        for (int otp : otpArray) {
            if (!otpSet.add(otp)) {
                // If the add method returns false, it means the OTP already exists, so it's not unique
                return false;
            }
        }
        
        // If all OTPs were added to the set successfully, they are unique
        return true;
    }

    public static void main(String[] args) {
        // Array to store the 10 generated OTP numbers
        int[] otpArray = new int[10];
        
        // Generate 10 OTP numbers and store them in the array
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
            System.out.println("Generated OTP #" + (i + 1) + ": " + otpArray[i]);
        }

        // Check if all OTPs are unique
        boolean isUnique = areOTPsUnique(otpArray);

        if (isUnique) {
            System.out.println("\nAll OTP numbers are unique.");
        } else {
            System.out.println("\nThere are duplicate OTP numbers.");
        }
    }
}
