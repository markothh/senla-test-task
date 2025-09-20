package hangman;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Game {
    private final int MAX_LIVES = 6;

    private final WordProvider wordProvider = new WordProvider();
    private final HangmanImageProvider hangmanImageProvider = new HangmanImageProvider();
    private final Player player;

    String wordToGuess;
    private char[] guessed;
    private HashSet<Character> letters;

    private int lives;

    public Game(Player player) {
        this.player = player;
    }

    public void startHangman() {
        System.out.printf("Добро пожаловать в игру, %s\n", player.getName());
        wordToGuess = wordProvider.chooseWord();
        guessed = new char[wordToGuess.length()];
        Arrays.fill(guessed, '_');
        letters = new HashSet<>();
        for (char c : wordToGuess.toCharArray()) {
            letters.add(c);
        }
        lives = MAX_LIVES;

        Scanner scanner = new Scanner(System.in);
        while (lives > 0) {
            printInfo();

            System.out.print("Введите букву: ");
            char c = scanner.next().toLowerCase().charAt(0);

            if (checkLetter(c)) {
                System.out.println("Такая буква есть в слове!");
                if (wordToGuess.equals(String.valueOf(guessed))) {
                    System.out.printf("%s, Вы отгадали слово! Поздравляем!\n", player.getName());
                    System.out.println("Игра завершена со следующими параметрами:");
                    printInfo();
                    return;
                }
            }
            else {
                System.out.println("Такой буквы в слове нет :(");
                lives -= 1;
            }
        }

        System.out.printf("Нам жаль, но вы проиграли, %s\n", player.getName());
        System.out.printf("Вы пытались отгадать слово: %s\n", wordToGuess);
        System.out.println("Ваши результаты:");
        printInfo();
    }

    private boolean checkLetter(char c) {
        if (letters.contains(c)) {
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (c == wordToGuess.charAt(i)) {
                    guessed[i] = c;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }

    private void printInfo() {
        System.out.printf("Количество жизней: %d\n", lives);
        System.out.printf("Загаданное слово: %s\n", String.valueOf(guessed));
        System.out.println(hangmanImageProvider.getState(lives));
        System.out.println("======================================================");
    }

}
