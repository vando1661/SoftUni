package _4MultidimensionalArraysExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class JA06StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("[\\()]");
        int commandRotate = Integer.parseInt(input[1]);
        String text = scanner.nextLine();
        int countRows = 0;
        int countCols = Integer.MIN_VALUE;
        ArrayDeque<String> deque = new ArrayDeque<>();
        while (!text.equals("END")) {
            if (text.length() > countCols) {
                countCols = text.length();
            }
            deque.offer(text);
            countRows++;
            text = scanner.nextLine();
        }
        char[][] matrix = new char[countRows][countCols];
        readMatrix(countRows, countCols, deque, matrix);

        int angleOfRotation = commandRotate % 360;

        if (angleOfRotation == 0) {
            printMatrix0(countRows, countCols, matrix);

        } else if (angleOfRotation == 90) {
            printMatrix90(countRows, countCols, matrix);

        } else if (angleOfRotation == 180) {
            printMatrix180(countRows, countCols, matrix);


        } else if (angleOfRotation == 270) {
            printMatrix270(countRows, countCols, matrix);
        }
    }

    private static void readMatrix(int countRows, int countCols, ArrayDeque<String> deque, char[][] matrix) {
        for (int row = 0; row < countRows; row++) {
            String symbol = deque.poll();
            for (int col = 0; col < countCols; col++) {
                if (col < symbol.length()) {
                    char c = symbol.charAt(col);
                    matrix[row][col] = c;
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }
    }

    private static void printMatrix270(int countRows, int countCols, char[][] matrix) {
        for (int col = countCols - 1; col >= 0; col--) {
            for (int row = 0; row < countRows; row++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void printMatrix180(int countRows, int countCols, char[][] matrix) {
        for (int row = countRows - 1; row >= 0; row--) {
            for (int col = countCols - 1; col >= 0; col--) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void printMatrix90(int countRows, int countCols, char[][] matrix) {
        for (int col = 0; col < countCols; col++) {
            for (int row = countRows - 1; row >= 0; row--) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void printMatrix0(int countRows, int countCols, char[][] matrix) {
        for (int row = 0; row < countRows; row++) {
            for (int col = 0; col < countCols; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

}
