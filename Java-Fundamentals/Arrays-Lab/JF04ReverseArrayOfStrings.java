package arraysLab;

import java.util.Scanner;

public class JF04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String [] inputArr = scanner.nextLine().split(" ");
        for (int i = 0; i < inputArr.length / 2; i++) {
            String oldInput = inputArr[i];
            inputArr[i] = inputArr[inputArr.length - 1 - i];
            inputArr[inputArr.length - 1 - i] = oldInput;

        }
        System.out.println(String.join(" ",inputArr));
    }
}
