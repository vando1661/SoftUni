package _3MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class JA08WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = readArray(scanner);
        }
        int[] indexes = readArray(scanner);
        int valueToReplace = matrix[indexes[0]][indexes[1]];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length ; c++) {
                if(matrix[r][c] == valueToReplace){
                    int correctValue = getNearSum(matrix,r,c,valueToReplace);
                    matrix[r][c] = correctValue;
                }
            }
        }
        for (int[] arr :matrix) {
            for (int n: arr) {
                System.out.print(n + " ");
            }
            System.out.println();
        }


    }

    private static int getNearSum(int[][] matrix,int r, int c,int valueToReplace) {
        int sum = 0;
        if(isInBounds( matrix, r + 1 ,c) && matrix[r+1][c] != valueToReplace){
            sum += matrix[r+1][c];
        }
        if(isInBounds(matrix, r - 1,c) && matrix[r-1][c] != valueToReplace){
            sum+= matrix[r-1][c];
        }if(isInBounds(matrix, r ,c -1) && matrix[r][c-1] != valueToReplace){
            sum+= matrix[r][c-1];
        }if(isInBounds(matrix, r ,c + 1) && matrix[r][c+1] != valueToReplace){
            sum+= matrix[r][c+1];
        }

        return sum;
    }

    private static boolean isInBounds(int [][]matrix,int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }
    private static boolean isOutBounds(int[][] matrix, int row, int col) {
        return !isInBounds(matrix,row, col);
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
    
}
