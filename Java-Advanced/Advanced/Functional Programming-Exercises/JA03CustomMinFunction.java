package _10FunctionalProgrammingExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JA03CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        /*Function<int[], Integer> function = arr -> {
            int min = Integer.MAX_VALUE;
            for (int number : arr) {
                if (number < min) {
                    min = number;
                }
            }
            return min;
        };
        int min = function.apply(num);
        System.out.println(min);*/

        Function<int[],Integer> minimum = element -> Collections.min(Arrays.stream(element).boxed().collect(Collectors.toList()));
        System.out.println(minimum.apply(num));


        /*Function<int [],Integer> minimum = element -> Arrays.stream(element).min().orElseThrow(() -> new IllegalArgumentException());
        System.out.println(minimum.apply(num));*/



    }
}
