package _9FunctionalProgrammingLab;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JA05FilterByAge {
    public static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Function<Scanner, Person> readPerson = sc -> {
            String[] data = sc.nextLine().split(", ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            return new Person(name, age);

        };

        List<Person> people = IntStream.range(0, n)
                .mapToObj(i -> readPerson.apply(scanner))
                .collect(Collectors.toList());
        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String nameFormat = scanner.nextLine();
        Predicate<Person> filter = ageFilter(condition, age);
        Consumer<Person> printer = getPrinter(nameFormat);
        people.stream()
                .filter(filter)
                .forEach(printer);
    }

    private static Consumer<Person> getPrinter(String nameFormat) {
        switch (nameFormat) {
            case "name":
                return p -> System.out.println(p.name);
            case "age":
                return p -> System.out.println(p.age);
            case "name age":
                return p -> System.out.println(p.name + " - " + p.age);
            default:
                throw new IllegalArgumentException("Unknown print format " + nameFormat);
        }
    }

    private static Predicate<Person> ageFilter(String condition, int age) {
        switch (condition) {
            case "older":
                return p -> p.age >= age;
            case "younger":
                return p -> p.age <= age;
            default:
                throw new IllegalArgumentException("Unknown condition " + condition);
        }
    }
}
