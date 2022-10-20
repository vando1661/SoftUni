package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class JF05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i <= numbers.length - 1; i++) {
          int currentNumber = numbers[i];
          if (i == numbers.length - 1){
              System.out.print(currentNumber + " ");
              break;
          }
          boolean isTop = false;
            for (int j = i + 1; j <= numbers.length - 1 ; j++) {
            int nextNumber = numbers[j];
            if(currentNumber > nextNumber){
                isTop = true;
            }else {
                isTop = false;
                break;
            }
            }
            if(isTop){
                System.out.print(currentNumber + " ");
            }
        }
    }
}
