
package Java_OOP._02WorkingWithAbstraction_Exercise.greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long capacityBag = Long.parseLong(scanner.nextLine());
        String[] readArray = scanner.nextLine().split("\\s+");

        //var bag = new LinkedHashMap<String, LinkedHashMap<String, Long>>();
        Map<String, LinkedHashMap<String, Long>> bag = new LinkedHashMap<>();
        long goldAmount = 0;
        long gemAmount = 0;
        long wallet = 0;

        for (int i = 0; i < readArray.length; i += 2) {
            String nameItem = readArray[i];
            long quantityItem = Long.parseLong(readArray[i + 1]);

            String typeItem = "";

            if (nameItem.length() == 3) {
                typeItem = "Cash";
            } else if (nameItem.toLowerCase().endsWith("gem")) {
                typeItem = "Gem";
            } else if (nameItem.toLowerCase().equals("gold")) {
                typeItem = "Gold";
            }

            if (typeItem.equals("")) {
                continue;
            } else if (capacityBag < bag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + quantityItem) {
                continue;
            }

            switch (typeItem) {
                case "Gem":
                    if (!bag.containsKey(typeItem)) {
                        if (bag.containsKey("Gold")) {
                            if (quantityItem > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(typeItem).values().stream().mapToLong(e -> e).sum() + quantityItem > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bag.containsKey(typeItem)) {
                        if (bag.containsKey("Gem")) {
                            if (quantityItem > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(typeItem).values().stream().mapToLong(e -> e).sum() + quantityItem > bag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!bag.containsKey(typeItem)) {
                bag.put((typeItem), new LinkedHashMap<String, Long>());
            }

            if (!bag.get(typeItem).containsKey(nameItem)) {
                bag.get(typeItem).put(nameItem, 0L);
            }


            bag.get(typeItem).put(nameItem, bag.get(typeItem).get(nameItem) + quantityItem);
            if (typeItem.equals("Gold")) {
                goldAmount += quantityItem;
            } else if (typeItem.equals("Gem")) {
                gemAmount += quantityItem;
            } else if (typeItem.equals("Cash")) {
                wallet += quantityItem;
            }
        }

        print(bag);
    }

    private static void print(Map<String, LinkedHashMap<String, Long>> bag) {
        for (var b : bag.entrySet()) {
            Long sumValues = b.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", b.getKey(), sumValues));

            b.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }
}