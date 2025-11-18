import java.util.Scanner;
public class PlayerInputHandler {
    private Scanner scanner = new Scanner(System.in);
    private final int wordLength = 7;

    public String getPlayerGuess() {
        String guess;
        while (true) {
            System.out.print("Enter your " + wordLength + "-letter country guess: ");
            guess = scanner.nextLine().toUpperCase();
            if (guess.length() == wordLength) {
                break;
            } else {
                System.out.print("Invalid guess. Enter a " + wordLength + "-letter country: ");
            }
        }
        return guess;


    }

    public void closeScanner() {
        scanner.close();
    }
}
