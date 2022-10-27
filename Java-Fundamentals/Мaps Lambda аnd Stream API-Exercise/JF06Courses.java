package mapsLambdaAndStreamAPIExercise;

import java.util.*;

public class JF06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Map<String, List<String>> mapCurses = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("end")){
            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];
            if(!mapCurses.containsKey(courseName)){
                mapCurses.put(courseName,new ArrayList<>());
            }
            mapCurses.get(courseName).add(studentName);
            input = scanner.nextLine();
        }
        mapCurses.entrySet()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
                });
    }
}
