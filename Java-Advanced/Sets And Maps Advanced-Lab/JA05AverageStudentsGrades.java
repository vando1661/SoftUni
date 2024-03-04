package _5SetsAndMapsAdvanced_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class JA05AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n  = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String name = input.split(" ")[0];
            double grade = Double.parseDouble(input.split(" ")[1]);

            studentsMap.putIfAbsent(name,new ArrayList<>());
            studentsMap.get(name).add(grade);

        }
        for (Map.Entry<String,List<Double>> entry:studentsMap.entrySet()) {
            double avg = 0;
            for (Double grade : entry.getValue()) {
                avg += grade;
            }

            //Alex -> 2.00 3.00 (avg: 2.50)
            System.out.printf("%s -> %s (avg: %.2f)%n",
                    entry.getKey(),
                    entry.getValue().stream()
                            .map(d ->String.format("%.2f",d))
                            .collect(Collectors.joining(" ")),
                    avg / entry.getValue().size()
            );
        }
    }
}
