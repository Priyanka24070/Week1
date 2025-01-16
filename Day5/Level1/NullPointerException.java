public class NullPointerException {

    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        // Define a string variable and initialize it to null
        String text = null;

        // Attempt to call a method on the null variable (this will generate a NullPointerException)
        System.out.println("Length of the text: " + text.length());
    }

    // Method to handle the NullPointerException using try-catch block
    public static void handleNullPointerException() {
        // Define a string variable and initialize it to null
        String text = null;

        try {
            // Attempt to call a method on the null variable (this will generate a NullPointerException)
            System.out.println("Length of the text: " + text.length());
        } catch (NullPointerException e) {
            // Handle the exception and print an appropriate message
            System.out.println("Caught a NullPointerException: Cannot call methods on a null object.");
        }
    }

    public static void main(String[] args) {
        // Call the method to generate the NullPointerException
        System.out.println("Generating NullPointerException...");
        generateNullPointerException(); // This will cause a runtime exception

                System.out.println("\nHandling NullPointerException with try-catch...");
        handleNullPointerException(); // This will catch the exception and print a message
    }
}
