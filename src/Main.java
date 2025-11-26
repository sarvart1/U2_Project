import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IllegalArgumentException {
        WordLoader loader = new WordLoader();
        String secretCountry = loader.selectRandomWord();
        PlayerInputHandler inputHandler = new PlayerInputHandler();
        WordleGame game = new WordleGame(secretCountry, inputHandler);
        game.playGame();


    }
}
