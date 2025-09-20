package password_generator;

import java.util.Random;

public class PasswordGenerator {
    public String generate(int length) {
        char[] password = new char[length];

        Random random = new Random();

        password[0] = (char)('A' + random.nextInt(26));
        password[1] = (char)('a' + random.nextInt(26));
        password[2] = (char)('0' + random.nextInt(10));
        password[3] = (char)('!' + random.nextInt(15));

        for (int i = 4; i < length; i++) {
            int type = random.nextInt(4);
            switch (type) {
                case 0: password[i] = (char)('A' + random.nextInt(26)); break;
                case 1: password[i] = (char)('a' + random.nextInt(26)); break;
                case 2: password[i] = (char)('0' + random.nextInt(10)); break;
                case 3: password[i] = (char)('!' + random.nextInt(15)); break;
            }
        }

        for (int i = 0; i < 4; i++) {
            int ind = random.nextInt(length);

            char tmp = password[i];
            password[i] = password[ind];
            password[ind] = tmp;
        }

        return String.valueOf(password);
    }
}
