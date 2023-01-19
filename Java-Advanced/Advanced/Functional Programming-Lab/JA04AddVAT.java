package _9FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.DoubleUnaryOperator;
import java.util.stream.Collectors;

public class JA04AddVAT {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] num = Arrays.stream(scanner.nextLine().split(", "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        DoubleUnaryOperator addVat = p -> p * 1.2;

        Consumer<double[]> priceWithVAT = p -> {
            System.out.println("Prices with VAT:");
            System.out.println(Arrays.stream(p)
                    .map(addVat)
                    .mapToObj(d -> String.format("%.2f", d))
                    .collect(Collectors.joining(System.lineSeparator())));

        };

        priceWithVAT.accept(num);

    }
}
