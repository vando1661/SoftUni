package _4MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class JA02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int [] numSize = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = numSize[0];
        int cols = numSize[1];
       String [][] matrix = new String[rows][cols];
       palindromesMatrix(rows, cols, matrix);
        for (String [] arr:matrix) {
            for (String text:arr) {
                System.out.printf("%s ",text);
            }
            System.out.println();
        }
    }

    private static void palindromesMatrix(int rows, int cols, String[][] matrix) {
        for (int row = 0; row < rows; row++) {
            int countMid = 0;
            for (int col = 0; col < cols; col++) {
                char left = (char) ('a' + row);
                char mid = (char) ('a' + row + countMid);
                char right = (char) ('a' + row);
                countMid++;
                String text = "" + left + mid + right;
               matrix[row][col] = text;
            }
        }
    }
}
