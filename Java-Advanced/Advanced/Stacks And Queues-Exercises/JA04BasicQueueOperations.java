package _2StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class JA04BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] text = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int elementOffer = text[0];
        int elementPoll = text[1];
        int looking = text[2];
        int[] elements = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> queueElement = new ArrayDeque<>();
        for (int i = 0; i < elementOffer; i++) {
            queueElement.offer(elements[i]);
        }
        for (int i = 0; i < elementPoll; i++) {
            queueElement.poll();
        }
        if (queueElement.contains(looking)) {
            System.out.println("true");
        } else if (queueElement.isEmpty()) {
            System.out.println("0");

        } else {
            //System.out.println(Collections.min(queueElement));
            //System.out.println(queueElement.stream().min(Integer::compare).get());
            System.out.println(queueElement.stream().mapToInt(e-> e).min().getAsInt());
        }
    }
}
