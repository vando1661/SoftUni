package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class JF03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int sum = 0;
        int [] numbersArr = Arrays
        .stream(scanner.nextLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();
        for (int i = 0; i < numbersArr.length; i++) {
         if (numbersArr[i] %2 == 0){
         sum = sum + numbersArr[i];
        }

        }
        System.out.println(sum);
    }
}
