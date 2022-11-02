package _1StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class JA03DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayDeque<Integer> decimalStack = new ArrayDeque<>();
        int decimal = Integer.parseInt(scanner.nextLine());
        while (decimal != 0){
            decimalStack.push(decimal % 2);
            decimal /=2;
        }if (!decimalStack.isEmpty()){
            for (int n:decimalStack) {
                System.out.print(n);

            }
        }else {
            System.out.println(decimal);
        }
    }
}
