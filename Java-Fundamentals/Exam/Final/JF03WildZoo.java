package exam.Final;

import java.util.*;

public class JF03WildZoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String commandLine = scanner.nextLine();

        Map<String, Integer> animalFoodMap = new LinkedHashMap<>();
        Map<String, List<String>> areaAnimalsMap = new LinkedHashMap<>();
        while (!commandLine.equals("EndDay")) {
            String[] arr = commandLine.split(": ");
            String command = arr[0];
            String[] commandArr = arr[1].split("-");
            String animalName = commandArr[0];
            int foodAmount = Integer.parseInt(commandArr[1]);
            int currentFood;
            String area;

            switch (command) {
                case "Add":
                    area = commandArr[2];
                    if (!animalFoodMap.containsKey(animalName)) {   //Проверка дали Animal-a вече го имаме.
                        animalFoodMap.put(animalName, foodAmount);
                        List<String> animals = new ArrayList<>();
                        if (!areaAnimalsMap.containsKey(area)) {    //Проверка дали Area-та вече я имаме.
                            animals.add(animalName);
                            areaAnimalsMap.put(area, animals);
                        } else {
                            animals = areaAnimalsMap.get(area);
                            animals.add(animalName);
                            areaAnimalsMap.put(area, animals);      //Ако Area-та я има, увеличаваме + 1 Animal
                        }
                    } else {
                        currentFood = animalFoodMap.get(animalName);
                        animalFoodMap.put(animalName, foodAmount + currentFood);
                    }
                    break;
                case "Feed":
                    if (animalFoodMap.containsKey(animalName)) {
                        currentFood = animalFoodMap.get(animalName);
                        animalFoodMap.put(animalName, currentFood - foodAmount);
                        if (animalFoodMap.get(animalName) <= 0) {
                            System.out.println(animalName + "was successfully fed");
                            for (Map.Entry<String, List<String>> stringListEntry : areaAnimalsMap.entrySet()) {
                                stringListEntry.getValue().remove(animalName);
                            }for (Map.Entry<String, List<String>> stringListEntry : areaAnimalsMap.entrySet()){
                                int listSiza = stringListEntry.getValue().size();
                                if(listSiza <=0){
                                    areaAnimalsMap.remove(stringListEntry.getKey());
                                }
                            }

                            animalFoodMap.remove(animalName);

                        }
                    }
                    break;
            }
            commandLine = scanner.nextLine();
        }
        System.out.println("Animals:");
        animalFoodMap.forEach((animal, food) -> System.out.printf(" %s -> %dg%n", animal, food));
        System.out.println("Areas with hungry animals:");
        areaAnimalsMap.forEach((area, value) -> System.out.printf("%s: %d%n", area, value.size()));
    }
}
