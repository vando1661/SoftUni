package methodsExercise;

import java.util.Scanner;

public class JF08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        long fact1 = calculateF(num1);
        long fact2 = calculateF(num2);
        double result = fact1 * 1.0 / fact2;
        System.out.printf("%.2f",result);

    }
    private static long calculateF (int num){
        long fact = 1;
        for (int i = 1; i <=num; i++) {
           fact = fact * i;
        }
        return fact;
    }
}
