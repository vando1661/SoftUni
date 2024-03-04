package _10FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class JA02KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> name = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        Consumer<String> consumer = n -> System.out.println("Sir " + n);
        name.forEach(consumer);
    }
}
