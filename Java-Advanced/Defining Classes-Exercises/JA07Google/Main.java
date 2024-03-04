package _12DefiningClassesExercises.JA07Google;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Person> personData = new HashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("End")){
            String [] parameters = input.split("\\s");
            String name = parameters[0];
            if (!personData.containsKey(name)){
                personData.put(name, new Person());
            }
            String infoPerson = parameters[1];
            switch (infoPerson) {
                case "company":
                    String companyName = parameters[2];
                    String companyDepartment = parameters[3];
                    double salary = Double.parseDouble(parameters[4]);
                    Company company = new Company(companyName, companyDepartment, salary);
                    personData.get(name).setCompany(company);
                break;
                case "pokemon":
                    String pokemonName = parameters[2];
                    String pokemonType = parameters[3];
                    Pokemon pokemon = new Pokemon(pokemonName,pokemonType);
                    personData.get(name).getPokemons().add(pokemon);
                    break;
                case "parents":
                    String parentName = parameters[2];
                    String parentBirthday = parameters[3];
                    Parents parents = new Parents(parentName,parentBirthday);
                    personData.get(name).getParents().add(parents);
                    break;
                case "children":
                    String childName = parameters[2];
                    String childBirthday  = parameters[3];
                    Children children = new Children(childName,childBirthday);
                    personData.get(name).getChildren().add(children);
                    break;
                case "car":
                    String carModel = parameters[2];
                    int speed = Integer.parseInt(parameters[3]);
                    Car car = new Car(carModel,speed);
                    personData.get(name).setCar(car);
                    break;
            }
            input = scanner.nextLine();
        }
        String searchPerson = scanner.nextLine();
        System.out.println(searchPerson);
        Person personalDate = personData.get(searchPerson);
        System.out.println(personalDate);
    }
}
