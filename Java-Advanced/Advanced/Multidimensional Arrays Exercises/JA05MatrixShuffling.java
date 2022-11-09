package _4MultidimensionalArraysExercises;

import java.util.Scanner;

public class JA05MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] size = text.split(" ");
        int rows = Integer.parseInt(size[0]);
        int cols = Integer.parseInt(size[1]);
        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] input = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = input[col];
            }
        }
        String  input = scanner.nextLine();
        while (!input.equals("END")) {
            String [] command = input.split(" ");
            String string = command[0];
            if(!string.equals("swap")) {
                System.out.println("Invalid input!");
            }else if (command.length == 5){
                int index1 = Integer.parseInt(command[1]);
                int index2 = Integer.parseInt(command[2]);
                int index3 = Integer.parseInt(command[3]);
                int index4 = Integer.parseInt(command[4]);
                if(index1 >= rows || index2 >=cols || index3 >= rows || index4 >= cols){
                    System.out.println("Invalid input!");
                }else {
                   String oldValue = matrix[index1][index2];
                   String newValue = matrix[index3][index4];
                    matrix[index1][index2] = newValue;
                    matrix[index3][index4] = oldValue;
                    printMatrix(matrix);
                }
            }else {
                System.out.println("Invalid input!");
            }

            input = scanner.nextLine();
        }

    }

    private static void printMatrix(String[][] matrix) {
        for (String [] arr: matrix) {
        for (String num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        }
    }
}


