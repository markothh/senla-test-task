package password_generator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите желаемую длину пароля (от 8 до 12): ");

        int length;
        try {
            length = scanner.nextInt();
            if (length > 12 || length < 8) {
                throw new RuntimeException("Illegal password length");
            }
        }
        catch (Exception e) {
            System.out.println("Ввод неверный!");
            return;
        }

        String password = passwordGenerator.generate(length);
        System.out.printf("Сгенерированный пароль: %s", password);
    }
}
