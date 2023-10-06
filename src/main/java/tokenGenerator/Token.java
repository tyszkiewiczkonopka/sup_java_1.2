package tokenGenerator;

import java.util.Random;

public class Token {
    int numberOfCharacters;
    char character;

    public Token(int numberOfCharacters) {
        this.numberOfCharacters = numberOfCharacters;
    }

    public void generateToken() {
        for (int i = 1; i <= numberOfCharacters; i++) {
            Random random = new Random();
            character = (char) random.nextInt(33, 126);
            System.out.print(character);
        }
    }

}
