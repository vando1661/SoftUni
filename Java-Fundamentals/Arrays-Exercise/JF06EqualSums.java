package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class JF06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int [] arr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean isFound = false;
        for (int index = 0; index <= arr.length - 1; index++) {
            int currentElement = arr[index];
            int leftSum = 0;
            int rightSum = 0;

            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += arr[leftIndex];
            }
            for (int rightIndex = index + 1; rightIndex <=arr.length - 1; rightIndex++) {
                rightSum+=arr[rightIndex];
            }
            if(leftSum == rightSum){
                System.out.println(index);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("no");
        }
    }
}
