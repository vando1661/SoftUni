package _9FunctionalProgrammingLab;

import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JA06FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] number = scanner.nextLine().split(" ");
        int startNum = Integer.parseInt(number[0]);
        int endNum = Integer.parseInt(number[1]);
        String filter = scanner.nextLine();
        IntPredicate predicate = n -> filter.equals("odd") == (n % 2 != 0);
        System.out.println(IntStream.rangeClosed(startNum, endNum)
                .filter(predicate)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}
