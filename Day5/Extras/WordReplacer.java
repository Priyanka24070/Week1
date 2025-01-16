public class WordReplacer {

    // Method to replace a word with another word in a sentence
    public static String replace(String sentence, String oldWord, String newWord) {
        StringBuilder result = new StringBuilder();

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Loop through each word and replace if it matches the old word
        for (String word : words) {
            if (word.equals(oldWord)) {
                result.append(newWord).append(" "); // Append new word
            } else {
                result.append(word).append(" "); // Append the original word
            }
        }

        // Return the modified sentence, remove the trailing space
        return result.toString().trim();
    }

    // Main method to test the replace method
    public static void main(String[] args) {
        String sentence = "I love programming in Java. Java is fun!";
        String oldWord = "Java";
        String newWord = "Python";

        // Replace the old word with the new word
        String updatedSentence = replace(sentence, oldWord, newWord);

        // Print the updated sentence
        System.out.println("Original sentence: " + sentence);
        System.out.println("Updated sentence: " + updatedSentence);
    }
}
