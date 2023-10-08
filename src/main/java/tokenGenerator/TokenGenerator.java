package tokenGenerator;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TokenGenerator {
    private int tokenLength;
    private String token = "";
    private static final List<Integer> validTokenLengths = Arrays.asList(5, 10, 15);


    public String generate(int tokenLength) {

        this.tokenLength = tokenLength;

        if (!validateTokenLength()) {
            System.out.println("Sorry, the number you provided for token length is not valid.\n" +
                    "Please choose between 5, 10 or 15 characters.");
            return null;
       }

        for (int i = 1; i <= tokenLength; i++) {
            Random random = new Random();
            token = token + (char) random.nextInt(33, 126);
        }
        return token;
    }

    private boolean validateTokenLength() {
        return validTokenLengths.contains(tokenLength);
    }
}