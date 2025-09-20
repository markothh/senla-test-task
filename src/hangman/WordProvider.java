package hangman;

import java.util.Random;

public class WordProvider {
    private final String[] WORDS = new String[] {"apple", "banana", "баракуда"};

    public String chooseWord() {
        int ind = new Random().nextInt(WORDS.length);
        return WORDS[ind];
    }
}
