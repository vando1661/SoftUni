package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class JF05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int asciiStart = Integer.parseInt(scanner.nextLine());
        int asciiEnd = Integer.parseInt(scanner.nextLine());
        int symbol = 0;
        for (int code = asciiStart; code <= asciiEnd; code++) {
            symbol = code;
            System.out.printf("%c ", symbol);

        }
    }
}
