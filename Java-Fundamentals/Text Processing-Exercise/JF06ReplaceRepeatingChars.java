package textProcessingExercise;

import java.util.Scanner;

public class JF06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        String res = "";
        char first = input.charAt(0);
        res += first;
        for (int i = 1; i < input.length(); i++) {
            char current = input.charAt(i);
            if(current != first){
                res += current;
                first = current;
            }
        }
        System.out.println(res);
    }
}
