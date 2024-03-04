package _5SetsAndMapsAdvanced_Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JA09Largest_3_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted((n1, n2) -> n2.compareTo(n1))
                .limit(3)
                .map(String::valueOf)
                .collect(Collectors.joining(" "))
                );


    }

}

