package _10FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class JA06PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxSize = Integer.parseInt(scanner.nextLine());
        List<String> nameList = Arrays.stream(scanner.nextLine().split("\\s+")).toList();
        Predicate<String> validName = name -> name.length() <= maxSize;
        nameList.stream().filter(validName).forEach(System.out::println);
    }
}
