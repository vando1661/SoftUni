package textProcessingExercise;

import java.util.Scanner;

public class JF04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String text = scanner.nextLine();
        StringBuilder cryptoTex = new StringBuilder();
        for (int position = 0; position <=text.length()-1; position++) {
            char symbol = text.charAt(position);
            char cryptSymbol  = (char)(symbol + 3);
            cryptoTex.append(cryptSymbol);
        }
        System.out.println(cryptoTex);
    }
}
