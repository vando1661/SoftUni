package exam.Mid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JF0303MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List <Integer>  list = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("End")){
            String command = input.split(" ")[0];
            int index = Integer.parseInt(input.split(" ")[1]);
            int currentPoint = Integer.parseInt(input.split(" ")[2]);
            if(command.equals("Shoot")){

                if(index < list.size() && index >=0){
                    list.set(index,list.get(index)-currentPoint);
                    if(list.get(index) <= 0){
                        list.remove(index);
                    }
                }
            }else if(command.equals("Add")){
                if(index < list.size() && index >=0){
                    list.add(index,currentPoint);
                }else {
                    System.out.println("Invalid placement!");
                }
            }else if(command.equals("Strike")){
                int endRadius = index + currentPoint;
                int startRadius = index - currentPoint;
                if(endRadius < list.size() && (endRadius >= 0) && startRadius >= 0 && (startRadius < list.size())){
                    for (int i = endRadius; i >=startRadius; i--) {
                        list.remove(i);
                    }
                }else {
                    System.out.println("Strike missed!");
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(list.toString().replaceAll("[\\[\\] ]", "").replaceAll(",", "|"));

    }
}
