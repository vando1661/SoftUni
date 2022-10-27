package mapsLambdaAndStreamAPIExercise;

import java.util.*;

public class JF07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Map<String , List<Double>> mapStudents = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=n ; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if(!mapStudents.containsKey(name)){
                mapStudents.put(name,new ArrayList<>());
            }
                mapStudents.get(name).add(grade);
        }
        Map<String, Double> studentAverage = new LinkedHashMap<>();
        for (Map.Entry<String,List<Double>>entry : mapStudents.entrySet()){
            String name = entry.getKey();
            List<Double> grades = entry.getValue();
            double average = getAverage(grades);
            if(average >= 4.50){
                studentAverage.put(name,average);

            }

        }
        studentAverage.entrySet()
                .forEach(e -> System.out.printf("%s -> %.2f%n",e.getKey(),e.getValue()));

    }
    private static double getAverage(List<Double>grades){
        double sumGrades = 0;
        for (double grade:grades) {
            sumGrades+=grade;
        }
        return sumGrades / grades.size();
    }
}
