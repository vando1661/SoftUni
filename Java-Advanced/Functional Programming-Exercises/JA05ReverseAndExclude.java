package _10FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JA05ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int num = Integer.parseInt(scanner.nextLine());
        Collections.reverse(numbersList);
        Predicate<Integer> predicate = number -> number % num == 0;
        numbersList.removeIf(predicate);
        numbersList.forEach(e -> System.out.print(e + " "));


    }
}
