import java.util.*;

public class M04Homework {
    public static void main(String[] args) {
        List<String> secretWordOptions = Arrays.asList(
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

        playGame(secretWord);
    }

    public static void playGame(String secretWord) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        final int maxAttempts = 6;
        char[] secretWordChars = secretWord.toCharArray();

        while (attempts < maxAttempts) {
            System.out.println("Enter your guess (a 5-letter word):");
            String guess = scanner.nextLine().trim().toLowerCase();

            if (guess.length() != 5) {
                System.out.println("Error: Please enter a word with exactly 5 letters.");
                // Skip counting this as an attempt
                continue;
            }

            attempts++;

            if (guess.equals(secretWord)) {
                System.out.println("Winner! You've guessed the correct word: " + secretWord);
                return;
            }

            String matchedChars = getMatchedChars(guess, secretWordChars);

            System.out.println("These letters are in the secret word: " + matchedChars);
            System.out.println("Attempts remaining: " + (maxAttempts - attempts));
        }

        System.out.println("Thanks for playing. The secret word was: " + secretWord);

    }

    public static String getMatchedChars(String guess, char[] secretWordChars) {
        String matchedChars = "";
        boolean[] found = new boolean[26]; // to account for duplicate letters from user input

        for (int i = 0; i < guess.length(); i++) {
            char guessChar = guess.charAt(i);
            for (int j = 0; j < secretWordChars.length; j++) {
                if (guessChar == secretWordChars[j] && !found[guessChar - 'a']) {

                    matchedChars += guessChar + " ";

                    found[guessChar - 'a'] = true;
                    break;
                }
            }
        }

        return matchedChars.toString().trim();
    }
}
