package _4MultidimensionalArraysExercises;

import java.util.Scanner;

public class JA07Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String [] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int [][] matrix = new int[rows][cols];
           getReadMatrix(rows, cols, matrix);
           String commands = scanner.nextLine();
           while (!commands.equals("Nuke it from orbit")){
               String [] text = commands.split(" ");
               int r = Integer.parseInt(text[0]);
               int c = Integer.parseInt(text[1]);
               int radius = Integer.parseInt(text[2]);


               for (int row = r - radius; row < r + radius ; row++) {
                   int  rr = row;
               }
               for (int col = c-radius; col < c+radius; col++) {

                   //matrix[r][col] = deleted;
                   }



               commands = scanner.nextLine();
           }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int [] arr : matrix) {
            for (int num: arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static void getReadMatrix(int rows, int cols, int[][] matrix) {
        int count = 1;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int n = count;
                matrix[row][col] = n;
                count++;
            }
        }
    }

}
