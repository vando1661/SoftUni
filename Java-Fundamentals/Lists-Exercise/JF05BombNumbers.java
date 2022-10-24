package listsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JF05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List <String> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String [] data = scanner.nextLine().split("\\s+");
        String bombNumber = data[0];
        int power = Integer.parseInt(data[1]);
        int sum = 0;
        while (numbers.contains(bombNumber)){
            int numIndex = numbers.indexOf(bombNumber);
            int left = Math.max(0,numIndex - power);
            int right = Math.min(numIndex +  power,numbers.size()-1);
            for (int i = right; i >=left; i--) {
                numbers.remove(i);

            }
        }
        System.out.println(numbers.stream().mapToInt(Integer::parseInt).sum());

    }
}
