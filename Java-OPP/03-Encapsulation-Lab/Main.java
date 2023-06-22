package Java_OOP._03EncapsulationLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    /*public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<Java_OOP._03EncapsulationLab.Java_OOP._06InheritanceExercises.JO01Person.Java_OOP._08InterfacesAndAbstractionExercises.jo01DefineAnInterfacePerson.Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            people.add(new Java_OOP._03EncapsulationLab.Java_OOP._06InheritanceExercises.JO01Person.Java_OOP._08InterfacesAndAbstractionExercises.jo01DefineAnInterfacePerson.Person(input[0], input[1], Integer.parseInt(input[2])));
        }
        people.sort(Comparator.comparing(Java_OOP._03EncapsulationLab.Java_OOP._06InheritanceExercises.JO01Person.Java_OOP._08InterfacesAndAbstractionExercises.jo01DefineAnInterfacePerson.Person::getFirstName).thenComparingInt(Java_OOP._03EncapsulationLab.Java_OOP._06InheritanceExercises.JO01Person.Java_OOP._08InterfacesAndAbstractionExercises.jo01DefineAnInterfacePerson.Person::getAge));


        for (Java_OOP._03EncapsulationLab.Java_OOP._06InheritanceExercises.JO01Person.Java_OOP._08InterfacesAndAbstractionExercises.jo01DefineAnInterfacePerson.Person person : people)
            System.out.println(person.toString());
    }*/
   /* public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Java_OOP._03EncapsulationLab.Java_OOP._06InheritanceExercises.JO01Person.Java_OOP._08InterfacesAndAbstractionExercises.jo01DefineAnInterfacePerson.Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            Optional<Java_OOP._03EncapsulationLab.Java_OOP._06InheritanceExercises.JO01Person.Java_OOP._08InterfacesAndAbstractionExercises.jo01DefineAnInterfacePerson.Person> person = Optional.empty();
            try {
               person = Optional.of(new Java_OOP._03EncapsulationLab.Java_OOP._06InheritanceExercises.JO01Person.Java_OOP._08InterfacesAndAbstractionExercises.jo01DefineAnInterfacePerson.Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3])));
            }catch (IllegalStateException e ){
                System.out.println(e.getMessage());
            }
            person.ifPresent(people::add);
        }
        double bonus = Double.parseDouble(reader.readLine());
        for (Java_OOP._03EncapsulationLab.Java_OOP._06InheritanceExercises.JO01Person.Java_OOP._08InterfacesAndAbstractionExercises.jo01DefineAnInterfacePerson.Person person : people) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }
    }*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Team team = new Team("Black Eagles");
        while (n-- > 0) {
            String[] date = reader.readLine().split("\\s+");
            String firstName = date[0];
            String lastName = date[1];
            int age = Integer.parseInt(date[2]);
            double salary = Double.parseDouble(date[3]);
            Person person = new Person(firstName, lastName, age, salary);
            team.addPlayer(person);
        }
        List<Person> firstTeam = team.getFirstTeam();
        List<Person> reserveTeam = team.getReserveTeam();
        /*firstTeam = firstTeam.stream()
                .sorted(Comparator.comparing(Java_OOP._03EncapsulationLab.Java_OOP._06InheritanceExercises.JO01Person.Java_OOP._08InterfacesAndAbstractionExercises.jo01DefineAnInterfacePerson.Person::getAge))
                .collect(Collectors.toList());*/
        System.out.println("First team have " + firstTeam.size() +" players");
        System.out.println("Reserve team have "+ reserveTeam.size() +" players");
    }
}

