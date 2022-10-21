package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class JF06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        int numbers = num;
        int allFact = 0;
        for (int i = 0; i < input.length(); i++) {
            int digit = num %10;
            num /= 10;
            int fact = 1;
            for (int j = 1; j <=digit ; j++) {
                fact*= j;

            }
            allFact += fact;
        }if (numbers == allFact){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

    }
}
