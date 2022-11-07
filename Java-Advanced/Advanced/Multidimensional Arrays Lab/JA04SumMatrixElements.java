package _3MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class JA04SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int [] rowAndCol  = Arrays
                .stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = rowAndCol[0];
        int cols = rowAndCol[1];
        int[][]  matrix = new int[rows][cols];
        int sum = 0;
        for (int row = 0; row < rows ; row++) {
            int [] numRow = Arrays
                    .stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int col = 0; col < cols; col++) {
                matrix [row][col] = numRow[col];
                sum = sum + numRow[col];
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);

    }
}
