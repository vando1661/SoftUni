package Java_OOP._08InterfacesAndAbstractionExercises.jo03BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Birthable> thingsIsBirthday = new ArrayList<>();
        while (!"End".equals(input)){
            String [] date = input.split("\\s+");
            String type = date[0];
            switch (type){
                case "Citizen":
                    String name = date[1];
                    int age = Integer.parseInt(date[2]);
                    String id = date[3];
                    String birthDate = date[4];
                    Citizen citizen = new Citizen(name,age,id,birthDate);
                    thingsIsBirthday.add(citizen);
                    break;
                case "Pet":
                    String petName = date[1];
                    String birthDatePet = date[2];
                    Pet pet = new Pet(petName,birthDatePet);
                   thingsIsBirthday.add(pet);
                    break;
                case "Robot":
                    break;
            }

            input = scanner.nextLine();
        }
        String currentYear = scanner.nextLine();
        boolean isFound = false;
        for (Birthable birthable:thingsIsBirthday) {
            if(birthable.getBirthDate().endsWith(currentYear)){
                System.out.println(birthable.getBirthDate());
                isFound = true;
            }
        }
        if(!isFound){
            System.out.println("<no output>");
        }

    }
}
