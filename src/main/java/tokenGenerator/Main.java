package tokenGenerator;

public class Main {
    public static void main(String[] args) {
        TokenGenerator token = new TokenGenerator();
        String result = token.generate(5);

        System.out.println("token: " + result);
    }
}
