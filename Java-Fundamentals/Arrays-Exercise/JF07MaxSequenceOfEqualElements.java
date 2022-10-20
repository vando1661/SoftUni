package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class JF07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int maxSequence = 0;
        int length = 1;

        int startIndex = 0;
        int bestStart = 0;
        for (int index = 1; index < numArr.length; index++) {
             if(numArr[index] == numArr[index - 1]){
                 length++;
             }else {
                 length = 1;
                 startIndex = index;
             } if(length > maxSequence){
                 maxSequence = length;
                 bestStart = startIndex;
            }
        }
        for (int i = bestStart; i < bestStart + maxSequence; i++) {

            System.out.print(numArr[i] + " ");
        }
    }
}
