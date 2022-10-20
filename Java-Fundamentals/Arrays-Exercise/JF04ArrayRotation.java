package arraysExercise;

import java.util.Scanner;

public class JF04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String [] numArr = scanner.nextLine().split(" ");
        int times = Integer.parseInt(scanner.nextLine());
        for (int rotation = 1; rotation <= times ;rotation++) {
            String firstElement = numArr[0];
            for (int i = 0; i < numArr.length-1; i++) {
                numArr[i] = numArr[i + 1];
            }
            numArr[numArr.length - 1] = firstElement;
        }
        for (String element : numArr) {
            System.out.print(element + " ");

        }
    }
}
