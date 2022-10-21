package arraysLab;


import java.util.Arrays;
import java.util.Scanner;

public class JF06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int [] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int [] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        boolean arrNotIdentical = false;
        for (int i = 0; i < firstArr.length;i++) {
            sum+= firstArr[i];
            if (firstArr[i] != secondArr[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                arrNotIdentical = true;
                break;
            }
        }if(!arrNotIdentical){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }

    }
}
