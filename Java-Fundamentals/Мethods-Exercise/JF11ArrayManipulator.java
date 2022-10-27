package methodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class JF11ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int [] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] comands = input.split(" ");
            String typeComands = comands[0];
            switch (typeComands){
                case "exchange ":
                    int exchangeIndex = Integer.parseInt(comands[1]);
                    if(isValidIndex(exchangeIndex,numbers.length)){
                        //exchange();
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "min":
                    break;
                case "max":
                    break;
                case "first":
                    break;
                case "last":
                    break;
            }


            input = scanner.nextLine();
        }


    }private static void exchange (int[] numbers,int exchangeIndex ){
        int [] numbersToExchangeIndex = new int [exchangeIndex + 1];
        int [] numbersAfterExchangeIndex = new int [numbers.length - exchangeIndex -1];
        for (int index = 0; index <=exchangeIndex ; index++) {
            int currentElement = numbers[index];
            numbersToExchangeIndex[index]= currentElement;
        }
        for (int index = exchangeIndex + 1; index <=numbers.length - 1 ; index++) {
            int currentElement = numbers[index];
            numbersAfterExchangeIndex[index - exchangeIndex]= currentElement;
        }
        int[]exchangeArray = new int [numbers.length];
        for (int index = 0; index <=numbersAfterExchangeIndex.length- 1 ; index++) {
            exchangeArray[index]=numbersAfterExchangeIndex[index];
        }
        for (int index = numbersAfterExchangeIndex.length; index <=exchangeArray.length -1 ; index++) {
            exchangeArray[index] = numbersToExchangeIndex[index - numbersAfterExchangeIndex.length];

        }
        numbers = exchangeArray;

    }

    private static boolean isValidIndex(int index,int length ) {
        return index>= 0 && index <= length -1;
    }
}
