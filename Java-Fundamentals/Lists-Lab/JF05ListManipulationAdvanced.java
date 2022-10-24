package listsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JF05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")){
           List<String> commandsList=Arrays.stream(input.split(" ")).collect(Collectors.toList());
           String command = commandsList.get(0);
           switch (command){
               case "Contains":
                   int numContains = Integer.parseInt(commandsList.get(1));
                   if (numList.contains(numContains)) {
                       System.out.println("Yes");
                   }else {
                       System.out.println("No such number");
                   }
                   break;
               case "Print":
                   String secondCommand = commandsList.get(1);
                   if(secondCommand.equals("even")){
                       List<Integer> evenNumList = getEvenNumbers(numList);
                       System.out.println(evenNumList.toString().replaceAll("[\\[\\],]", ""));
                   }else {
                       List<Integer> oddNumList = getOddNumbers(numList);
                       System.out.println(oddNumList.toString().replaceAll("[\\[\\],]", ""));
                   }
                   break;
               case "Get":
                   int sum = 0;
                   for (int i = 0; i < numList.size(); i++) {
                       sum = sum + numList.get(i);
                   }
                   System.out.println(sum);
                   break;
               case "Filter":
                   String condition = commandsList.get(1);
                   int number = Integer.parseInt(commandsList.get(2));
                   List<Integer> conditionalNumList = getConditionNumbers(numList,condition, number);
                   System.out.println(conditionalNumList.toString().replaceAll("[\\[\\],]", ""));
                   break;
           }

            input = scanner.nextLine();
        }
    }
    public static List<Integer> getConditionNumbers(List<Integer>initLIst,String condition,int number){
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < initLIst.size(); i++) {
            int currentNum = initLIst.get(i);

            if(condition.equals("<")){
                if (currentNum<number){
                    resultList.add(currentNum);
                }
            }else if(condition.equals(">")){
                if(currentNum > number){
                    resultList.add(currentNum);
                }
            }else if(condition.equals("<=")){
                if(currentNum <=number){
                    resultList.add(currentNum);
                }
            }else if(condition.equals(">=")){
                if(currentNum>= number){
                    resultList.add(currentNum);
                }
            }
        }
        return resultList;
    }

    public static List<Integer> getEvenNumbers (List<Integer> initList){
        List<Integer> evenNumbersList = new ArrayList<>();
        for (int i = 0; i < initList.size(); i++) {
            int currentItem = initList.get(i);
            if (currentItem % 2 == 0){
                evenNumbersList.add(currentItem);
            }

        }
        return evenNumbersList;
    }
    public static List<Integer> getOddNumbers(List<Integer> initList){
        List<Integer> oddNumersLIst = new ArrayList<>();
        for (int i = 0; i < initList.size() ; i++) {
            int curentItem = initList.get(i);
            if(curentItem % 2 !=0){
                oddNumersLIst.add(curentItem);
            }
        }
        return oddNumersLIst;
    }
}
