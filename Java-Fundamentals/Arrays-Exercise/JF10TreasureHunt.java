package arraysExercise;

import java.util.Scanner;

public class JF10TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String [] input = scanner.nextLine().split("\\|");
        String command = scanner.nextLine();
        while (!command.equals("Yohoho !")){
            String [] commandParts = command.split(" ");
            switch (commandParts[0]) {
                case "Loot":
                    for (int i = 1; i < commandParts.length; i++) {
                        boolean already = false;
                        for (int j = 0; j < input.length; j++) {
                            if (commandParts[i].equals(input[j])) {
                                already = true;
                                break;
                            }
                        }
                        if (!already) {
                            String newChest = commandParts[i] + " " + String.join(" ", input);
                            input = newChest.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int position = Integer.parseInt(commandParts[1]);
                    if (position <= input.length - 1 && position >= 0) {
                        String dropItem = input[position];
                        for (int i = position; i < input.length - 1; i++) {
                            input[i] = input[i + 1];
                        }
                        input[input.length - 1] = dropItem;
                    } else {
                        break;
                    }
                    break;
                case "Steal":
                    int numberOfStealingItems = Integer.parseInt(commandParts[1]);

                    if (numberOfStealingItems >= 0 && numberOfStealingItems < input.length) {
                        for (int i = 0; i < numberOfStealingItems; i++) {
                            System.out.print(input[input.length - numberOfStealingItems + i]);
                            if (i != numberOfStealingItems - 1) {
                                System.out.print(", ");
                            }
                        }
                        String[] tempChest = new String[input.length - numberOfStealingItems];
                        for (int i = 0; i < tempChest.length; i++) {
                            tempChest[i] = input[i];
                        }
                        input = tempChest;
                    } else if (numberOfStealingItems >= 0) {
                        for (int i = 0; i < input.length; i++) {
                            System.out.print(input[i]);
                            if (i != input.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        input = new String[0];
                    }
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }

        String treasureCount = String.join("", input);
    int charCounter = 0;
        for (int i = 0; i < treasureCount.length(); i++) {
        charCounter++;
    }
    double averageTreasure = (1.0 * charCounter) / input.length;
        if (charCounter > 0) {
        System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasure);
    } else {
        System.out.println("Failed treasure hunt.");
    }

    }
}
