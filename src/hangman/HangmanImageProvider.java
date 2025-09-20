package hangman;

public class HangmanImageProvider {
    private final String[] STATES = new String[] {
        "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n=========\n",
        "  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========\n",
        "  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========\n",
        "  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========\n",
        "  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========\n",
        "  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========\n",
        "  +---+\n  |   |\n      |\n      |\n      |\n      |\n=========\n"
    };

    public String getState(int lives) {
        return STATES[lives];
    }
}
