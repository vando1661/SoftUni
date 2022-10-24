package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class JF06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (char letter1 = 'a'; letter1 < 'a'+ num; letter1++) {
            for (char letter2 = 'a'; letter2 < 'a'+ num ; letter2++) {
                for (char letter3 = 'a'; letter3 < 'a'+ num; letter3++) {
                    System.out.printf("%c%c%c%n",letter1,letter2,letter3);
                }
            }
        }

    }
}
