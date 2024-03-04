package _2StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class JA06RecursiveFibonacci {
    public static long[] memory;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        long fi1 = 0;
        long fi2 = 1;
        long fi = 0;
        ArrayDeque<Long> fibonacci = new ArrayDeque<>();
        if(n == 0){
            System.out.println(0);
            return;
        }
        for (int i = 0; i < n; i++) {
            if(fibonacci.isEmpty()){
                fibonacci.push(fi1 + fi2);

            }
            else {
                fi1 = fibonacci.pop();
                fi = fi1 + fi2;
                fi2 = fi1;
                fibonacci.push(fi);

            }
        }
        System.out.println(fibonacci.pop());
    }
}
