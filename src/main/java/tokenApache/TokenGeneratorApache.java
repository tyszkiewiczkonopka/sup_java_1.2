package tokenApache;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Arrays;
import java.util.List;

public class TokenGeneratorApache {

    private int tokenLength;
    private static final List<Integer> validTokenLengths = Arrays.asList(5, 10, 15);


    public String generate(int tokenLength) {
        String token = "";
        this.tokenLength = tokenLength;

        if(!validateTokenLength()){
            System.out.println("Sorry, the number you provided for token length is not valid.\n" +
                    "Choose from accepted token lengths: " + validTokenLengths);
        }

        return RandomStringUtils.random(tokenLength, 33, 126, false, false);
    }

    private boolean validateTokenLength() {
        return validTokenLengths.contains(tokenLength);
    }
}
