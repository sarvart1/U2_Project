//+ means correct letter in right place, o means correct letter in wrong place, and - means letter is not in the word
import java.util.Random;
import java.util.List;

public class WordleGame {
    private final String secretWord;
    private int attemptsLeft = 6;
    private final PlayerInputHandler inputHandler;
    private final int maxGuesses = 6;
    private final int wordLength = 7;
    private boolean gameOver = false;

    private int guessesRemaining;

    public WordleGame(String secretWord, PlayerInputHandler inputHandler) {
        this.secretWord = secretWord;
        this.inputHandler = inputHandler;
        this.guessesRemaining = maxGuesses;
    }
    public void playGame() {
        System.out.println("Welcome to Countries Wordle! Guess the " + wordLength + "-letter country.");
        System.out.println("You have " + maxGuesses + "attempts.");

        while (!gameOver) {
            System.out.println("\nGuesses remaining: " + guessesRemaining);
            String guess = inputHandler.getPlayerGuess().toUpperCase();
            processGuess(guess);

        }
        inputHandler.closeScanner();
        }
        private void processGuess(String guess) {
            guessesRemaining--;
            String feedback = generateFeedback(guess);
            System.out.println("Feedback: " + feedback);

            if (guess.equals(secretWord)) {
                System.out.println("\nCongratulations! You guessed the country: " + secretWord);
                gameOver = true;
            } else if (guessesRemaining == 0) {
                System.out.println("\nGame Over! You ran out of guesses. The secret country was " + secretWord + "!");

            }
        }
        private String generateFeedback(String guess) {
        StringBuilder feedback = new StringBuilder();
        char[] secretChars = secretWord.toCharArray();
        char[] guessChars = guess.toCharArray();
        boolean[] matchedSecret = new boolean[wordLength];

        for (int i = 0; i < wordLength; i++) {
            if (guessChars[i] == secretChars[i]) {
                feedback.append('+');
                matchedSecret[i] = true;
                guessChars[i] = ' ';

            } else{
                feedback.append('-');

            }
        }






    }









}
