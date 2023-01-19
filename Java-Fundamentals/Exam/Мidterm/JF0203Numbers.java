package exam.Mid;

import java.util.*;
import java.util.stream.Collectors;

public class JF0203Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        int sum = 0;
        int count =0;
        for (int i = 0; i < numList.size(); i++) {
            count++;
            int num = numList.get(i);
            sum = sum + num;
        }
        double average = sum * 1.0 / count;
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < numList.size(); i++) {
            int num = numList.get(i);
            if(average < num){
                newList.add(num);
            }
        }if(newList.isEmpty()){
            System.out.println("No");
        }else if(numList.size() < 5 ){
            for (Integer number : newList) {
                System.out.printf("%d ", number);
            }
        }else {
            Collections.sort(newList);
            Collections.reverse(newList);
            newList = newList.stream().limit(5).collect(Collectors.toList());
            for (Integer numbers: newList) {
                System.out.printf("%d ",numbers);

            }
        }


    }
}
