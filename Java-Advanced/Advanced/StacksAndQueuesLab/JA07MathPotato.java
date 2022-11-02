package _1StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class JA07MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String [] children = scanner.nextLine().split("\\s+");
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue,children);
        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;
        while (queue.size() > 1){
            for (int i = 1; i <n; i++) {
                queue.offer(queue.poll());
            }if(isPrime(num)){
                System.out.println("Prime " + queue.peek());
            }else{
                System.out.println("Removed " + queue.poll());
            }
           num++;
        }
        System.out.println("Last is " + queue.poll());
    }
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;

    }
}
