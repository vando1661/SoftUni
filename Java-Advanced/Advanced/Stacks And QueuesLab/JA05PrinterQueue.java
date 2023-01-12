package _1StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class JA05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String text = scanner.nextLine();
        ArrayDeque<String> printerQueue = new ArrayDeque<>();
        while (!text.equals("print")){
            if(text.equals("cancel")){
                if(printerQueue.isEmpty()){
                    System.out.println("Printer is on standby");
                }else {

                    System.out.printf("Canceled %s%n",printerQueue.pollFirst());
                }
            }else {
                printerQueue.offer(text);

            }

            text = scanner.nextLine();
        }
        for (String print:printerQueue) {
            System.out.println(print);
        }
    }
}
