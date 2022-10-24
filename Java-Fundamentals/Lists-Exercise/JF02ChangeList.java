package listsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JF02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")){
            List<String> inputList = Arrays.stream(input.split(" "))
                    .collect(Collectors.toList());
            String command = inputList.get(0);
            switch (command){
                case "Delete":
                    int element = Integer.parseInt(inputList.get(1));
                    numbersList.removeAll(Arrays.asList(element));
                    break;
                case "Insert":
                    int e = Integer.parseInt(inputList.get(1));
                    int index = Integer.parseInt(inputList.get(2));
                    numbersList.add(index,e);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]",""));
    }
}
