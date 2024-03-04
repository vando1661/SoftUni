package _4MultidimensionalArraysExercises;

import java.util.Scanner;

public class JA04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
      String [] size = scanner.nextLine().split(" ");
      int rows = Integer.parseInt(size[0]);
      int cols = Integer.parseInt(size[1]);
      int [][] matrix = new int[rows][cols];
      for (int row = 0; row < rows; row++) {
            String [] inputRow = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(inputRow[col]);
            }
        }
        int maxSum = Integer.MIN_VALUE;
        int bestRow = 0;
        int bestCol = 0;
        for (int row = 0; row < rows -2; row++) {
            for (int col = 0; col < cols -2; col++) {
                int sum = 0;
                for (int currentRow = row; currentRow < row + 3; currentRow++) {
                    for (int currentCol = col; currentCol < col + 3; currentCol++) {
                        sum +=matrix[currentRow][currentCol];
                    }
                }
               if(sum > maxSum){
                   maxSum = sum;
                   bestRow = row;
                   bestCol = col;
               }
            }
        }
        System.out.println("Sum = " + maxSum);
        for (int row = bestRow; row < bestRow + 3; row++) {
            for (int col = bestCol; col < bestCol + 3; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
