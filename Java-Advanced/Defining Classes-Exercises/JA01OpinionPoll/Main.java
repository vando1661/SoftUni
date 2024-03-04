package _12DefiningClassesExercises.JA01OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        List<Person> peopleList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            String [] datePerson = scanner.nextLine().split(" ");
            String name = datePerson[0];
            int age = Integer.parseInt(datePerson[1]);
            Person person = new Person(name,age);
            peopleList.add(person);
        }
        peopleList.stream()
                .filter(person -> person.getAge() >30)
                .sorted((left,right) -> left.getName().compareTo(right.getName()))
                .forEach(System.out::println);
    }
}
