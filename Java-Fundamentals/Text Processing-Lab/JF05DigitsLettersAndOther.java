package textProcessingLab;

import java.util.Scanner;

public class JF05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String text = scanner.nextLine();
        StringBuilder digitStr = new StringBuilder();
        StringBuilder letter = new StringBuilder();
        StringBuilder diff = new StringBuilder();
        for (int i = 0; i < text.length() ; i++) {
            char symbol = text.charAt(i);
            if(Character.isDigit(symbol)){
                digitStr.append(symbol);
            }else if(Character.isLetter(symbol)){
                letter.append(symbol);
            }else {
                diff.append(symbol);
            }
        }
        System.out.println(digitStr);
        System.out.println(letter);
        System.out.println(diff);
    }
}
