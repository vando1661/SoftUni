package listsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JF08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        List<String> nameList = Arrays.stream(input.split("\\s+"))
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("3:1")){
            String [] commandData = command.split("\\s+");
            String commandName = commandData[0];
            if(commandName.equals("merge")) {
                String result = " ";
                int startIndex = Integer.parseInt(commandData[1]);
                int endIndex = Integer.parseInt(commandData[2]);
                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > nameList.size() - 1) {
                    endIndex = nameList.size() - 1;
                }
                boolean isStartValid = isValidIndex(startIndex, nameList.size());
                boolean isEndValid = isValidIndex(endIndex, nameList.size());
                if (isStartValid && isEndValid) {
                    StringBuilder resultMerage = new StringBuilder();
                    for (int index = startIndex; index <= endIndex; index++) {
                        resultMerage.append(nameList.get(index));
                    }
                    for (int index = startIndex; index <= endIndex; index++) {
                        nameList.remove(startIndex);
                    }
                    nameList.add(startIndex, resultMerage.toString());
                }
            }else if (commandName.equals("divide")) {
                int index = Integer.parseInt(commandData[1]);
                int partitions = Integer.parseInt(commandData[2]);
                String element = nameList.get(index);
                nameList.remove(index);
                int size = element.length() / partitions;
                int begin = 0;
                for (int part = 1; part < partitions; part++) {
                    nameList.add(index, element.substring(begin, begin + size));
                    index++;
                    begin += size;
                }
                nameList.add(index, element.substring(begin));
            }

            command = scanner.nextLine();
        }
        System.out.println(String.join(" ",nameList));

    }

    public static boolean isValidIndex (int index,int size){
        return index >=0 && index <= size - 1;
    }
}
