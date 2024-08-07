import java.util.*;

/**
 * Program implements guessing game logic to allow user to guess a word and
 * check if word matches a random generated secret word from array of
 * pre-defined words
 */

// CLI Javadoc command: javadoc -d [add directory-name]
// [add-source-code-file-name]
public class M04Homework {

    /**
     * Default constructor for M04Homework.
     * This constructor is automatically provided by Java if no other constructors
     * are defined.
     * It doesn't perform any actions and is provided for completeness of
     * documentation.
     */
    public M04Homework() {
        // Default constructor: Does not do anything, but included javadoc comment for
        // completeness of documentation
    }

    /**
     * main method of the program where execution starts
     *
     * @param args main method accepts an array of type string for any arguments
     *             passed by value
     */

    public static void main(String[] args) {
        List<String> secretWordOptions = List.of(
                "amber", "blaze", "coral", "fable", "glide",
                "joust", "knife", "plush", "quick", "prong",
                "quest", "razed", "maple", "chime", "latch",
                "oared", "rumba", "tidal", "brisk", "shiny",
                "wilty", "marks", "xylon", "graft", "prism",
                "frown", "brute", "group", "tying", "zebra",
                "jumpy", "haste", "liven", "quirk", "shred",
                "yacht", "climb", "views", "flake", "prose",
                "muted", "skirt", "blush", "churn", "folks",
                "spire", "draft", "ivory", "grasp", "mirth");
        String secretWord = secretWordOptions.get((new Random()).nextInt(secretWordOptions.size()));

        System.out.println("The secret word is: " + secretWord);

        guessingGame(secretWord);

    }

    /**
     * The guessingGame method is the bulk of the program; it
     * guides the user to guess a word and
     * check if their word matches the secret word
     *
     *
     * @param secretWord parameter accepts a randomly generated secret word into the
     *                   guessingGame method
     *
     */

    public static void guessingGame(String secretWord) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        final int MAX_ATTEMPTS = 6;
        int attempts = 0;

        char[] secretWordChars = new char[secretWord.length()];
        for (int i = 0; i < secretWord.length(); i++) {
            secretWordChars[i] = secretWord.charAt(i);
        }

        while (attempts < MAX_ATTEMPTS) {
            System.out.println("Please enter your word guess: ");
            String wordGuessed = scanner.nextLine().toLowerCase().trim();

            if (wordGuessed.length() < 5) {
                System.out.println("Error: You must enter a word that is five characters.");
                continue;
            }

            attempts++;

            if (wordGuessed.equals(secretWord)) {
                System.out.println("Winner! You have guessed the correct word: " + secretWord);
                return;
            }

            String matchingCharacters = checkMatchedChars(wordGuessed, secretWordChars);

            System.out.println("The letters are in the secret word: " + matchingCharacters);

            int attemptsRemaining = MAX_ATTEMPTS - attempts;

            System.out.println("You have " + attemptsRemaining + " remaining tries.");
        }
        System.out.println("Sorry, better luck next time. Thanks for playing.");
    }

    /**
     * Method checks for matching characters between two words
     *
     * @param wordGuessed     the user-defined guessed word all lowercase to ignore
     *                        capitalization
     * @param secretWordChars this parameter is an array of each character within
     *                        the secret word array that was created from the
     *                        randomly generated secret word
     * @return method returns a string that contains all the matching characters
     *         between secret word and user-defined word guessed
     */

    public static String checkMatchedChars(String wordGuessed, char[] secretWordChars) {
        String matchedChars = "";

        boolean[] seen = new boolean[26];

        for (int i = 0; i < wordGuessed.length(); i++) {
            char wordGuessedChar = wordGuessed.charAt(i);
            for (int j = 0; j < secretWordChars.length; j++) {
                if (wordGuessedChar == secretWordChars[j] && !seen[wordGuessedChar - 'a']) {
                    matchedChars += wordGuessedChar + " ";
                    seen[wordGuessedChar - 'a'] = true;

                }
            }
        }
        return matchedChars.toString();
    }

}
