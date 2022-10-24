package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class JF04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int quantity = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= quantity ; i++) {
            char symbol = scanner.nextLine().charAt(0);
            int asciiCode = (int) symbol;
            sum = sum + asciiCode;
        }
        System.out.printf("The sum equals: %d",sum);

    }
}
