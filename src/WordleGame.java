import java.util.Random;
import java.util.List;

public class WordleGame {
    private final String secretWord;
    private int attemptsLeft = 6;
    private final PlayerInputHandler inputHandler;
    private final int maxGuesses = 6;
    private final int wordLength = 7;

    private int guessesRemaining;

    public WordleGame(String secretWord, PlayerInputHandler inputHandler) {
        this.secretWord = secretWord;
        this.inputHandler = inputHandler;
        this.guessesRemaining = maxGuesses;
    }
    public void playGame() {
        System.out.println("Welcome to Countries Wordle! Guess the " + wordLength + "-letter country.");
        


    }



}
