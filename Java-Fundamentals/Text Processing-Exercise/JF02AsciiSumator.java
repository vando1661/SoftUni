package textProcessingMoreExercise;

import java.sql.Array;
import java.util.Scanner;

public class JF02AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        char first = scanner.nextLine().charAt(0);
        int firstIndex = first;
        char second = scanner.nextLine().charAt(0);
        int secondIndex = second;
        String input = scanner.nextLine();
        int sumIndex = 0;
        char [] arr = input.toCharArray();
        for (char element:arr) {
            int index = element;
            if(firstIndex < index && secondIndex > index){
                sumIndex += index;
            }

        }
        System.out.println(sumIndex);

    }
}
