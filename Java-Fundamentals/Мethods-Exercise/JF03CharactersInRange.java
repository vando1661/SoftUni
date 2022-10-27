package methodsExercise;

import java.util.Scanner;

public class JF03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        printCharRange(start,end);
    }
    private static void printCharRange (char symbol1, char symbol2){
     if(symbol1 < symbol2){
         for (char symbol = (char)(symbol1 + 1); symbol < symbol2; symbol++) {
             System.out.print(symbol + " ");
         }
     }else {
         for (char symbol = (char)(symbol2 + 1); symbol < symbol1 ; symbol++) {
             System.out.print(symbol + " ");
         }
     }
    }
}
