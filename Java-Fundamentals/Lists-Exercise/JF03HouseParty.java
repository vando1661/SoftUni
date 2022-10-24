package listsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JF03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int count = Integer.parseInt(scanner.nextLine());
        List<String> guestNames = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            String command = scanner.nextLine();
            List<String> commandList = Arrays.stream(command.split("\\s+"))
                    .collect(Collectors.toList());
            String name = commandList.get(0);
            if(commandList.size() == 3){
                if(guestNames.contains(name)){
                    System.out.printf("%s is already in the list!%n",name);
                }else {
                    guestNames.add(name);
                }

            }else if(commandList.size() == 4){
                if(guestNames.contains(name)){
                    guestNames.remove(name);
                }else {
                    System.out.printf("%s is not in the list!%n",name);
                }
            }
        }
        for (String name:guestNames) {
            System.out.println(name);

        }
    }
}
