import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class WordLoader {
    private final List<String> wordList = new ArrayList<>();
    private final String fileName = "countries.txt";

    public WordLoader () throws FileNotFoundException {
        loadWords();


    }
    private void loadWords() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        while(scanner.hasNextLine()) {
            String word = scanner.nextLine().toUpperCase();
            if(!word.isEmpty()) {
                wordList.add(word);
        }
        }
        scanner.close();

    }
    public String selectRandomWord () {
        Random rand = new Random();
        int randomIndex = rand.nextInt(wordList.size());
        return wordList.get(randomIndex);
    }
}
