package exam.Final;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JF0103ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        Map<String,String> composerMap = new LinkedHashMap<>();
        Map<String,String> keyMap = new LinkedHashMap<>();
        for (int index = 0; index < num; index++) {
            String [] dateArr = scanner.nextLine().split("\\|");
            String piece = dateArr[0];
            String composer = dateArr[1];
            String key = dateArr[2];
            composerMap.putIfAbsent(piece,composer);
            keyMap.putIfAbsent(piece,key);
        }
        String input = scanner.nextLine();
        while (!input.equals("Stop")){
            String [] commandArr = input.split("\\|");
            String command = commandArr[0];
            String piece = commandArr[1];
            switch (command){
                case "Add":
                    String composerAdd = commandArr[2];
                    String keyAdd = commandArr[3];
                    if(!composerMap.containsKey(piece)){
                        composerMap.put(piece,composerAdd);
                        keyMap.put(piece,keyAdd);
                        System.out.printf("%s by %s in %s added to the collection!%n",piece,composerAdd,keyAdd);
                    }else {
                        System.out.printf("%s is already in the collection!%n",piece);
                    }
                    break;
                case "Remove":
                    if(composerMap.containsKey(piece)){
                        composerMap.remove(piece);
                        keyMap.remove(piece);
                        System.out.printf("Successfully removed %s!%n",piece);
                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                    }
                    break;
                case "ChangeKey":
                    String newKey = commandArr[2];
                    if(keyMap.containsKey(piece)){
                        keyMap.replace(piece,newKey);
                        System.out.printf("Changed the key of %s to %s!%n",piece,newKey);
                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        /*plants.entrySet().stream().collect(Collectors.toList())
                .forEach(entry -> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",
                        entry.getKey(), entry.getValue(),
                        ratings.get(entry.getKey()).stream()
                                .mapToDouble(Double::doubleValue)
                                .average().orElse(0.0)));*/

        composerMap.entrySet().stream().collect(Collectors.toList())
                .forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n",entry.getKey(),entry.getValue()
                        ,keyMap.get(entry.getKey())).toString());
    }
}
