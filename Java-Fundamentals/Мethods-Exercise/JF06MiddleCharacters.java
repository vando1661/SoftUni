package methodsExercise;

import java.util.Scanner;

public class JF06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String textInput = scanner.nextLine();
        printMiddleCharacters(textInput);
    }
    private static void printMiddleCharacters (String text){
       if(text.length() % 2 == 1){
           int indexOfMiddleCharacter = text.length() / 2;
           System.out.println(text.charAt(indexOfMiddleCharacter));
       }else {
           int indexFistMiddleCharacter = text.length() / 2 - 1;
           int indexTwoMiddleCharacter = text.length() / 2 ;
           System.out.println("" + text.charAt(indexFistMiddleCharacter) + text.charAt(indexTwoMiddleCharacter));
       }
    }
}
