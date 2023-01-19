package exam.Mid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JF0503Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<String> journalList = Arrays.stream(scanner.nextLine().split("\\, "))
                .collect(Collectors.toList());
        String input  = scanner.nextLine();
        while (!input.equals("Craft!")){
        String [] commandArray = input.split(" - ");
        String fistCommand = commandArray[0];
        String itemCommand = commandArray[1];
        if(fistCommand.equals("Collect")){
            if(!journalList.contains(itemCommand)){
                journalList.add(itemCommand);
            }
        }else if(fistCommand.equals("Drop")){
            journalList.remove(String.valueOf(itemCommand));
        }else if(fistCommand.equals("Combine Items")){
            String [] secondCommand = commandArray[1].split(":");
            String first = secondCommand[0];
            String two = secondCommand[1];
            if (journalList.contains(first)){
                int index = journalList.indexOf(first);
                journalList.add(index + 1 ,two);

            }

        }else if(fistCommand.equals("Renew")){
            if(journalList.contains(itemCommand)){
                journalList.remove(itemCommand);
                journalList.add(itemCommand);

            }
        }



            input = scanner.nextLine();
        }

        System.out.print(String.join(", ",journalList));

    }
}
