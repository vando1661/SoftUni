package _9FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JA01SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(input.stream().map(String::valueOf)
                .collect(Collectors.joining(", ")));

        System.out.println(input.stream().sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", ")));

    }
}

