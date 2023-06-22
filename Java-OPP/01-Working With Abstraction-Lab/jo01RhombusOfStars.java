package Java_OOP._01WorkingWithAbstraction_Lab;

import java.util.Scanner;

public class jo01RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        topPart(n);
        midPart(n);
        downPart(n);

    }

    private static void topPart(int n) {
        for (int row = 1; row <= n - 1; row++) {
            printRow(n, row);
        }
    }

    private static void midPart(int n) {
        for (int star = 1; star <= n; star++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    private static void downPart(int n) {
        for (int row = n - 1; row >= 1 ; row--) {
            printRow(n, row);
        }
    }

    private  static void printRow(int n, int row){
        for (int space = 1; space <= n - row; space++) {
            System.out.print(" ");
        }
        for (int star = 1; star <= row; star++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
