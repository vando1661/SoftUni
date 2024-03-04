package Java_Advance._6SetsAndMapsAdvancedExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class JA03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> periodicTable = new TreeSet<>();
        for (int index = 0; index < n; index++) {
            periodicTable.addAll(Arrays.asList(scanner.nextLine().split(" ")));

        }
        System.out.println(String.join(" ", periodicTable));
    }
}
