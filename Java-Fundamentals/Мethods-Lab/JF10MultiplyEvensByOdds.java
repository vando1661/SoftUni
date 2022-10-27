package methodsLab;

import java.util.Arrays;
import java.util.Scanner;

public class JF10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] num = Arrays
                .stream(scanner.nextLine().split(""))
                .filter(s -> s.matches("\\d"))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(getMultiplySum(num));
    }
    public static int getMultiplySum(int[]  evenAndOdd) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < evenAndOdd.length ; i++) {
            if(evenAndOdd[i] % 2 == 0){
                even += evenAndOdd[i];
            } else{
                odd += evenAndOdd[i];
            }
        }
       return even * odd;
   }

}
