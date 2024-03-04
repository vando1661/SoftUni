package _3MultidimensionalArraysLab;

import java.util.Scanner;

public class JA03IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int amountOfArrays = Integer.parseInt(scanner.nextLine());
        int sizeOfArrays = Integer.parseInt(scanner.nextLine());
        char[][] first = new char[amountOfArrays][sizeOfArrays];
        for (int row = 0; row < amountOfArrays; row++) {
               first[row] = scanner.nextLine().replaceAll("\\s+","")
                       .toCharArray();
        }
        char[][] second = new char[amountOfArrays][sizeOfArrays];
        for (int row = 0; row < amountOfArrays; row++) {
            second[row] = scanner.nextLine().replaceAll("\\s+","")
                    .toCharArray();
        }
        char [][] matrix = new char[amountOfArrays][sizeOfArrays];
        for (int row = 0; row < amountOfArrays; row++) {
            for (int col = 0; col < sizeOfArrays; col++) {
                char firstElement = first[row][col];
                char secondElement = second[row][col];
                char fillChar = firstElement == secondElement ? firstElement : '*';
                        matrix[row][col] = fillChar;
            }
        }
        for (char [] chars : matrix) {
            for (char c : chars ) {
                System.out.print(c + " ");
            }
            System.out.println();
        }



    }
}
