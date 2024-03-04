package _5SetsAndMapsAdvanced_Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class JA08AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int people = Integer.parseInt(scanner.nextLine());
        TreeMap<String,Double> map = new TreeMap<>();
        double average = 0;
        for (int i = 0; i < people; i++) {
           String name = scanner.nextLine();
           double [] grades = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                  .toArray();
            double sum = 0.0;
            double count = 0.0;
            for (double grade: grades) {
               sum = sum + grade;
                count++;
                average = sum / count;
            }
            map.put(name,average);
            average = 0;
        }
        map.entrySet().stream().forEach(names ->
                System.out.println(names.getKey() + " is graduated with " + names.getValue()));

    }
}
