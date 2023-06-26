package Java_OOP._06InheritanceExercises.animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String animalType = scanner.nextLine();
    while (!"Beast!".equals(animalType)) {
        String[] animalsInfo = scanner.nextLine().split("\\s+");
        String name = animalsInfo[0];
        int age = Integer.parseInt(animalsInfo[1]);
        String gender = animalsInfo[2];
try {
        switch (animalType) {
            case "Cat":
                Cat cat = new Cat(name, age, gender);
                System.out.println(cat);
                break;
            case "Dog":
                Dog dog = new Dog(name, age, gender);
                System.out.println(dog);
                break;
            case "Frog":
                Frog frog = new Frog(name, age, gender);
                System.out.println(frog);
                break;
            case "Kittens":
                Kitten kittens = new Kitten(name, age);
                System.out.println(kittens);
                break;
            case "Tomcats":
                Tomcat tomcats = new Tomcat(name, age);
                System.out.println(tomcats);
                break;
        }
    }catch (IllegalArgumentException exception){
    System.out.println(exception.getMessage());
    }
        animalType = scanner.nextLine();
    }
    }
}

