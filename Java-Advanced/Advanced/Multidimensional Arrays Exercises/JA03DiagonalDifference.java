package _4MultidimensionalArraysExercises;

import java.util.Scanner;

public class JA03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];
        int sumDiagonals = 0;
        int firstDiagonalsSum = 0;
        int secondDiagonalsSum = 0;
        for (int row = 0; row < size; row++) {
            String [] input = scanner.nextLine().split(" ");
            for (int col = 0; col < size; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);
            }
        }
        /*for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if(row == col){
                    firstDiagonalsSum+=matrix[row][col];
                }
            }*/
        for (int index = 0; index < size; index++) {
            firstDiagonalsSum+=matrix[index][index];
        }
        /*int row = size -1;
        int col = 0;
        while (row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length){
            secondDiagonalsSum = secondDiagonalsSum + matrix[row][col];
            row--;
            col++;
        }*/
        for (int row = size - 1,col = 0; col < size && row >= 0 ; row--,col++) {
            secondDiagonalsSum = secondDiagonalsSum + matrix[row][col];
        }
        sumDiagonals =Math.abs(firstDiagonalsSum - secondDiagonalsSum);
        System.out.println(sumDiagonals);

    }
}

