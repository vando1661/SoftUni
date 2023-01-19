package exam.Final;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class JF0503PIrates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> populationMap = new LinkedHashMap<>();
        Map<String, Integer> goldMap = new LinkedHashMap<>();
        Map<String, Map<Integer, Integer>> map = new LinkedHashMap<>();
        // String [] commandParts;
        String command = scanner.nextLine();

        while (!command.equals("Sail")) {
            String commandTown = command.split("(\\\\s+)?(\\|{2})(\\\\s+)?")[0];
            int commandPeople = Integer.parseInt(command.split("(\\\\s+)?(\\|{2})(\\\\s+)?")[1]);
            int commandGold = Integer.parseInt(command.split("(\\\\s+)?(\\|{2})(\\\\s+)?")[2]);
            if(populationMap.containsKey(commandTown)){
                populationMap.put(commandTown, populationMap.get(commandTown)+commandPeople);
            }else {
                populationMap.put(commandTown,commandPeople);
            }
            if(goldMap.containsKey(commandTown)){
                goldMap.put(commandTown,goldMap.get(commandTown)+ commandGold);
            }else {
                goldMap.put(commandTown, commandGold);
            }

            command = scanner.nextLine();
        }
        while (!command.equals("End")) {
            String events = command.split("(\\\\s+)?(=>)(\\\\s+)?")[0];
            if (events.equals("Plunder")) {
                String town = command.split("(\\\\s+)?(=>)(\\\\s+)?")[1];
                int people = Integer.parseInt(command.split("(\\\\s+)?(=>)(\\\\s+)?")[2]);
                int gold = Integer.parseInt(command.split("(\\\\s+)?(=>)(\\\\s+)?")[3]);
                if (populationMap.containsKey(town) && goldMap.containsKey(town)) {
                    populationMap.put(town, populationMap.get(town) - people);
                    goldMap.put(town, goldMap.get(town) - gold);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);
                    if (populationMap.get(town) == 0 || goldMap.get(town) == 0) {
                        populationMap.remove(town);
                        goldMap.remove(town);
                        System.out.printf("%s has been wiped off the map!%n", town);
                    }
                }
            } else if (events.equals("Prosper")) {
                String town = command.split("(\\\\s+)?(=>)(\\\\s+)?")[1];
                int gold = Integer.parseInt(command.split("(\\\\s+)?(=>)(\\\\s+)?")[2]);
                if (goldMap.containsKey(town)) {
                    if (gold <= 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        goldMap.put(town, goldMap.get(town) + gold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, town, goldMap.get(town));
                    }
                }

                //"{gold added} gold added to the city treasury. {town} now has {total gold} gold."

            }

            command = scanner.nextLine();

        }
        //{town1} -> Population: {people} citizens, Gold: {gold} kg

        for (Map.Entry<String, Integer> entry : populationMap.entrySet()) {
            map.put(entry.getKey(), new HashMap<>());
            map.get(entry.getKey()).put(entry.getValue(), 0);
            for (Map.Entry<String, Integer> integerEntry : goldMap.entrySet()) {
                if (map.get(entry.getKey()).equals(map.get(integerEntry.getKey()))) {
                    map.get(entry.getKey()).put(entry.getValue(), integerEntry.getValue());
                }
            }
        }

        if (!map.isEmpty()){
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", map.size());
            map.entrySet()
                    .stream()
                    .forEach((entry) -> {
                        System.out.printf("%s -> ", entry.getKey());
                        entry.getValue().forEach((k, v) -> System.out.printf("Population: %d citizens, Gold: %d kg%n", k, v));
                    });


        } else  {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");

        }

    }
}
