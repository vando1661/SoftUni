package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class JF05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
       int [] numbers = Arrays
       .stream(scanner.nextLine().split(" "))
       .mapToInt(Integer::parseInt)
       .toArray();
       int evenSum = 0;
       int oodSum = 0;
        for( int number : numbers) {
            if( number % 2 == 0){
                evenSum+= number;
            }else {
                oodSum+= number;
            }
        }
        int diff = evenSum - oodSum;
        System.out.println(diff);

    }
}
