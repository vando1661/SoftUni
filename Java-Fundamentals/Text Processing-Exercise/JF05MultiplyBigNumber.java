package textProcessingExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class JF05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        BigInteger num1 = new BigInteger(scanner.nextLine());
        BigInteger num2 = new BigInteger(scanner.nextLine());
        System.out.println(num1.multiply(num2));
    }
}
