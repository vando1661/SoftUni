package _6SetsAndMapsAdvancedExercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class JA02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String digits = scanner.nextLine();
        int n1 = Integer.parseInt(digits.split(" ")[0]);
        int n2 = Integer.parseInt(digits.split(" ")[1]);
        Set<Integer> setFirst = new LinkedHashSet<>();
        Set<Integer> setSecond = new LinkedHashSet<>();
        for (int i = 0; i < n1; i++) {
            int element = Integer.parseInt(scanner.nextLine());
            setFirst.add(element);
        }
        for (int j = 0; j < n2; j++) {
            int element = Integer.parseInt(scanner.nextLine());
            setSecond.add(element);
        }
        setFirst.retainAll(setSecond);
        for (Integer num:setFirst) {
            System.out.print(num + " ");

        }
    }
}
