import java.util.*;

public class M04Homework {
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

    public static void guessingGame(String secretWord) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        final int MAX_ATTEMPTS = 6;
        int attempts = 0;

        char[] secretWordChars = secretWord.toCharArray();

        while (attempts < MAX_ATTEMPTS) {
            System.out.println("Please enter your word guess: ");
            String wordGuessed = scanner.nextLine().toLowerCase().trim();

            if (wordGuessed.length() < 5) {
                System.out.println("Error: You must enter a word that is five characters.");
                continue;
            }

            attempts++;

            if (wordGuessed.equals(secretWord)) {
                System.out.println("Winner! You have guessed the right word: " + secretWord);
                return;
            }

            String matchingCharacters = checkMatchedChars(wordGuessed, secretWordChars);

            System.out.println("The letters are in the secret word: " + matchingCharacters);

            int attemptsRemaining = MAX_ATTEMPTS - attempts;

            System.out.println("You have " + attemptsRemaining + " remaining tries.");
        }
        System.out.println("Sorry, better luck next time. Thanks for playing.");
    }

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
