package methodsExercise;

import java.util.Scanner;

public class JF10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int num = 1; num <= n; num++) {
            if(isSumDigits(num) && isContains(num) ){
                System.out.println(num);
            }
        }
    }
    private static boolean isSumDigits (int num){
       int sumDigits = 0;
       while (num > 0){
           int lastDigits = num % 10;
           sumDigits+= lastDigits;
           num = num / 10;
       }

        return sumDigits % 8 == 0;
    }
    private static boolean isContains (int num){
        while (num > 0){
            int lastDigit = num % 10;
            if(lastDigit % 2 == 1){
                return true;
            }
            num /= 10;
        }
        return false;
    }
}
