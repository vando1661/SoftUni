package exam.Mid;

import java.util.Arrays;
import java.util.Scanner;

public class JF0403HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int [] listSize = Arrays
                .stream(scanner.nextLine().split("\\@"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String text = scanner.nextLine();
        int lastPosition = 0;
        while (!text.equals("Love!")){
            String [] commandArray = text.split( "\\s+");
            int lengthJump = Integer.parseInt(commandArray[1]);
            lastPosition += lengthJump;

                if(lastPosition >= listSize.length){
                    lastPosition = 0;
                }
                if(listSize[lastPosition]!=0) {
                    listSize[lastPosition] -= 2;
                    if (listSize[lastPosition] ==0){
                        System.out.printf("Place %d has Valentine's day.%n",lastPosition);
                    }
                }else {
                    System.out.printf("Place %d already had Valentine's day.%n",lastPosition);
                }
            text = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n",lastPosition);
        boolean isTrue = true;
        for (int jump:listSize) {
            if(jump !=0){
                isTrue = false;
                break;
            }
        }
        int count = 0;
        for (int jump: listSize) {
            if(jump !=0){
                count++;
            }
        }if(isTrue){
            System.out.println("Mission was successful.");
        }else {
            System.out.printf("Cupid has failed %d places.",count);
        }
        }
    }





