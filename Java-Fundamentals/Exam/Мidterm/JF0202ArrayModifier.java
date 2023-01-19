package exam.Mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JF0202ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")){
            String command = input.split(" ")[0];
            int firstIndex = 0;
            int secondIndex = 0;
            if(command.equals("swap")){
                firstIndex = Integer.parseInt(input.split(" ")[1]);
                secondIndex = Integer.parseInt(input.split(" ")[2]);
                int first = list.get(firstIndex);
                int second = list.get(secondIndex);
                list.remove(firstIndex);
                list.add(firstIndex,second);
                list.remove(secondIndex);
                list.add(secondIndex,first);
            }else if(command.equals("multiply")){
                firstIndex = Integer.parseInt(input.split(" ")[1]);
                secondIndex = Integer.parseInt(input.split(" ")[2]);
                int first = list.get(firstIndex);
                int second = list.get(secondIndex);
                int total  = first * second;
                list.remove(firstIndex);
                list.add(firstIndex,total);



            }else if(command.equals("decrease")){
                List<Integer> newList = new ArrayList<>();
                for (Integer list1: list ) {
                    int num = list1-1;
                    newList.add(num);
                }
                list = newList;
            }
            input = scanner.nextLine();
        }
        System.out.println(list.toString().replaceAll("[\\[\\]]",""));
    }
}
