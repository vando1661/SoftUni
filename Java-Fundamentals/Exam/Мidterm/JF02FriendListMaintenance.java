package exam.Mid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JF02FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
         List <String> names = Arrays.stream(scanner.nextLine().split("\\,"))
                 .collect(Collectors.toList());
         String command = scanner.nextLine();
         int countBlacklist = 0;
         int lost = 0;
         boolean isTrue = false;
         while (!command.equals("Report")){
             List<String> commandList = Arrays.stream(command.split("\\s+"))
                     .collect(Collectors.toList());
             switch (commandList.get(0)){
                 case "Blacklist":
                     String name = commandList.get(1);
                     if(names.contains(name)){
                         countBlacklist++;
                         System.out.printf("%s was blacklisted.%n",name);
                         int index = names.indexOf(name);
                         //names.remove(name);
                         String lastname ="Blacklisted";
                         names.set(index,lastname);

                     }else {
                         System.out.printf("%s was not found.%n",name);
                     }
                     break;
                 case "Error":
                     int index = Integer.parseInt(commandList.get(1));
                     String nameError = names.get(index);
                     if(index <= names.size()) {
                         if (!names.contains("Blacklisted")) {
                             lost++;
                             names.remove(index);
                             System.out.printf("%s was lost due to an error.%n",nameError);
                         }
                     }
                     break;
                 case "Change":
                     int indexChange = Integer.parseInt(commandList.get(1));
                     String newName = commandList.get(2);
                     names.set(indexChange,newName);
                     break;
                     }

             command = scanner.nextLine();
         }
        System.out.printf("Blacklisted names: %d%n",countBlacklist);
        System.out.printf("Lost names: %d%n",lost);
        for (String name:names) {
            System.out.print(name + "");
        }
    }
}

