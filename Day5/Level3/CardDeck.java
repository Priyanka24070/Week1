import java.util.Random;

public class CardDeck {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        
        return deck;
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();
        int n = deck.length;
        
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + rand.nextInt(n - i);
            // Swap the cards at index i and randomCardNumber
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        
        return deck;
    }

    // Method to distribute the cards to players
    public static String[][] distributeCards(String[] deck, int numOfCards, int numOfPlayers) {
        // Check if it's possible to distribute cards
        if (numOfCards % numOfPlayers != 0) {
            System.out.println("The cards cannot be evenly distributed to the players.");
            return new String[0][0]; // Return empty array if not possible
        }

        int cardsPerPlayer = numOfCards / numOfPlayers;
        String[][] playersCards = new String[numOfPlayers][cardsPerPlayer];
        
        // Distribute cards to players
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playersCards[i][j] = deck[i * cardsPerPlayer + j];
            }
        }
        
        return playersCards;
    }

    // Method to print players and their cards
    public static void printPlayersCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : playersCards[i]) {
                System.out.print(card + " | ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        int numOfCards = 52;  // Total cards in the deck
        int numOfPlayers = 4; // Number of players

        // Initialize the deck
        String[] deck = initializeDeck();

        // Shuffle the deck
        deck = shuffleDeck(deck);

        // Distribute the deck of cards to players
        String[][] playersCards = distributeCards(deck, numOfCards, numOfPlayers);

        // Print the players' cards
        printPlayersCards(playersCards);
    }
}
