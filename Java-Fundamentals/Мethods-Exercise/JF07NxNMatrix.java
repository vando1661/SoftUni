package methodsExercise;

import java.util.Scanner;

public class JF07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num ; i++) {

            printMatrix(num);
        }
    }
    private static void printMatrix(int n){
        for (int i = 1; i <= n ; i++) {
            System.out.print(n + " ");
        }

        System.out.println();
    }
}
