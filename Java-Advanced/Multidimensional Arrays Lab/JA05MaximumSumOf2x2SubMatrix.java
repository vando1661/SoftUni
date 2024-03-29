package _3MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class JA05MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int [] rowAndCol  = Arrays
                .stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = rowAndCol[0];
        int cols = rowAndCol[1];
        int[][]  matrix = new int[rows][cols];
        for (int row = 0; row < rows ; row++) {
            matrix [row]= Arrays
                    .stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int [][] newMatrix = new int[2][2];
        int maxSum = Integer.MIN_VALUE;
        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols -1; col++) {
                int currSum = matrix[row][col]
                       + matrix [row][col + 1]
                       + matrix [row +1][col]
                       + matrix [row +1][col+1];


                if(maxSum < currSum){
                    maxSum = currSum;
                    newMatrix = new int[][] {
                            { matrix[row][col],matrix [row][col + 1]},
                            {matrix [row +1][col],matrix [row +1][col+1]}
                    };
                }
            }

        }
        printMatrix(newMatrix);
        System.out.println(maxSum);

    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();

        }
    }
}
