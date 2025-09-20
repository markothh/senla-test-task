package hangman;

public class Player {
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Game createHangman() {
        return new Game(this);
    }
}
