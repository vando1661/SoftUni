package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class JF08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());
        for (int index = 0; index < numArr.length - 1; index++) {
            int number = numArr[index];
            for (int i = index + 1; i <=numArr.length - 1; i++) {
                int number2 = numArr[i];
                if (number + number2 == magicSum) {
                    System.out.printf("%d %d%n", number, number2);
                }

            }
        }
    }
}
