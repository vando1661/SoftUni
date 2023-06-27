package Java_OOP._07InterfacesAndAbstractionLab.jo05BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commandType = scanner.nextLine();
        List<Identifiable> identifiables = new ArrayList<>();

        while (!"End".equals(commandType)){
            String [] type = commandType.split("\\s+");
            Identifiable identifiable;
            if(type.length == 3){
                String name = type[0];
                int age = Integer.parseInt(type[1]);
                String id = type[2];
                identifiable = new Citizen(name,age,id);
            }else {
                String model = type[0];
                String id = type[1];
                identifiable = new Robot(model,id);
            }
            identifiables.add(identifiable);
            commandType = scanner.nextLine();
        }
        String lastDigits = scanner.nextLine();
        identifiables.stream()
                .map(Identifiable::getId)
                .filter(id -> id.endsWith(lastDigits))
                .forEach(System.out::println);
    }
}
