package textProcessingExercise;

import java.util.Scanner;

public class JF02CharacterMultiplier {
    private static Integer multiplier(String first, String second) {
        char [] firstArr = first.toCharArray();
        char [] secondArr = second.toCharArray();
        Integer sum = 0;
        int minLength = Math.min(firstArr.length, secondArr.length);
        int maxLength = Math.max(firstArr.length, secondArr.length);
        for (int i = 0; i < minLength; i++) {
            sum+= firstArr[i] * secondArr[i];
        }if (maxLength == firstArr.length) {
            for (int i = minLength; i < maxLength; i++)
            {
                sum += firstArr[i];
            }
        } else {
            for (int i = minLength; i < maxLength; i++)
            {
                sum += secondArr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        String first = input.split(" ")[0];
        String second = input.split(" ")[1];
        Integer sum = multiplier(first,second);
        System.out.println(sum);


    }
}
