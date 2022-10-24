package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class JF02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int total = 0;
        while (num > 0){
            int currentNum = 0;
            currentNum = num % 10 ;
            num = num /10;
            total = total + currentNum;

        }
        System.out.println(total);

    }
}
