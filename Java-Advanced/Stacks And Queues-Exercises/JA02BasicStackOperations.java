package _2StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class JA02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] text = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int elementPush = text[0];
        int elementPop = text[1];
        int looking = text[2];
        int[] elements = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> stackElement = new ArrayDeque<>();
        for (int i = 0; i < elementPush; i++) {
            stackElement.push(elements[i]);
        }
        for (int i = 0; i < elementPop; i++) {
            stackElement.pop();
        }
        if (stackElement.contains(looking)) {
            System.out.println("true");
        } else if (stackElement.isEmpty()) {
            System.out.println("0");

        } else {
            //System.out.println(Collections.min(stackElement));
            //System.out.println(stackElement.stream().min(Integer::compare).get());
            System.out.println(stackElement.stream().mapToInt(e-> e).min().getAsInt());
        }


    }
}
