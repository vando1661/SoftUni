package _2StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class JA03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int commands = Integer.parseInt(scanner.nextLine());
        ArrayDeque <Integer> stack = new ArrayDeque<>();
        for (int i = 1; i <= commands ; i++) {
            int [] numCommand = Arrays
                    .stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int command = numCommand[0];
            if(command == 1){
                int value = numCommand[1];
                stack.push(value);
            }else if(command == 2){
                stack.pop();
            }else{
                System.out.println(Collections.max(stack));
            }

        }

    }
}
