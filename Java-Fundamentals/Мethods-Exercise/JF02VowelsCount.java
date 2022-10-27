package methodsExercise;

import java.util.Scanner;

public class JF02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String  textInput = scanner.nextLine().toLowerCase();
        int countVowels = vowelsCount(textInput);
        System.out.println(countVowels);
    }
    private static int vowelsCount (String text){
        int count = 0;
        for (char symbol:text.toCharArray()) {
          if(symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u'){
              count++;
          }
        }
        return count;
    }
}
