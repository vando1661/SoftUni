package _10FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JA09ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int endOfRange = Integer.parseInt(scanner.nextLine());
        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Predicate<Integer> isDivisible = number -> {
            for (Integer num : numList) {
                if (number % num != 0) {
                    return false;
                }
            }
            return true;
        };
        for (int index = 1; index <=endOfRange; index++) {
            if (isDivisible.test(index)) {
                System.out.print(index + " ");
            }
        }
    }
}
