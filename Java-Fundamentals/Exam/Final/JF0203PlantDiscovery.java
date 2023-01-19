package exam.Final;

import java.util.*;
import java.util.stream.Collectors;

public class JF0203PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        int number = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plants = new LinkedHashMap<>();
        Map<String, List<Double>> ratings = new LinkedHashMap<>();

        while (number-- > 0) {
            String[] input = scanner.nextLine().split("<->");

            String plant = input[0];
            int rarity = Integer.parseInt(input[1]);

            plants.put(plant, rarity);
            ratings.putIfAbsent(plant, new ArrayList<>());
        }

        String input;

        while (!"Exhibition".equals(input = scanner.nextLine())) {
            String[] tokens = input.split(": ");
            String command = tokens[0];
            String[] data = tokens[1].split(" - ");
            String name = data[0];

            if (!plants.containsKey(data[0])) {
                System.out.println("error");
                continue;
            }

            switch (command) {
                case "Rate": {
                    double rating = Double.parseDouble(data[1]);
                    ratings.get(name).add(rating);
                    break;
                }
                case "Update": {
                    int updatedRarity = Integer.parseInt(data[1]);
                    plants.put(name, updatedRarity);
                    break;
                }
                case "Reset": {
                    ratings.get(name).clear();
                    break;
                }
                default:
                    System.out.println("error");
            }
        }

        System.out.println("Plants for the exhibition:");

        plants.entrySet().stream().collect(Collectors.toList())
                .forEach(entry -> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",
                        entry.getKey(), entry.getValue(),
                        ratings.get(entry.getKey()).stream()
                                .mapToDouble(Double::doubleValue)
                                .average().orElse(0.0)));
        /*plants.entrySet().stream().forEach(stringIntegerEntry -> System.out.println(stringIntegerEntry.getKey()));
        ratings.entrySet().stream().forEach(stringListEntry -> System.out.printf(String.format("- %s; Rarity: %d; Rating: %.2f",stringListEntry.getKey(),stringListEntry.getValue().stream()
                .mapToDouble(Double::doubleValue)
                .average().orElse(0.00))));*/
    }
}
