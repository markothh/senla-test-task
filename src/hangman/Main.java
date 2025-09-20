package hangman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        Player player = new Player(scanner.next());

        Game game = player.createHangman();
        game.startHangman();
    }
}
