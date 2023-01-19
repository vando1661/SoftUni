package _9FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class JA02SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function<int[], String> sum = elements -> "Sum = " + Arrays.stream(elements).sum();
        Function<int[], String> count = elements -> "Count = " + Arrays.stream(elements).count();

        int[] num = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        ;
        System.out.println(count.apply(num));
        System.out.println(sum.apply(num));
    }
}
