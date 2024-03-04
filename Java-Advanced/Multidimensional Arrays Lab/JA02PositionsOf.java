package _3MultidimensionalArraysLab;

import java.util.Scanner;

public class JA02PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfArrays = scanner.nextInt();
        int sizeOfArrays = scanner.nextInt();
        int[][] matrix = new int[amountOfArrays][sizeOfArrays];
        for (int row = 0; row < amountOfArrays; row++) {
            for (int col = 0; col < sizeOfArrays; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
        StringBuilder output = new StringBuilder();
        int numFind = scanner.nextInt();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == numFind) {
                    output
                            .append(row)
                            .append(" ")
                            .append(col)
                            .append(System.lineSeparator());
                }
            }
        }

            System.out.println(output.isEmpty() ? "not found" : output);

    }
}
