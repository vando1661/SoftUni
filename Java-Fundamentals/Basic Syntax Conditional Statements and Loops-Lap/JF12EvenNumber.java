package basicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class JF12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int num = Integer.parseInt(scanner.nextLine());
        while (true) {
            if (num % 2 == 0) {
                System.out.printf("The number is: %d",Math.abs(num));
                break;
            }else {
                System.out.printf("Please write an even number.%n");
            }
            num = Integer.parseInt(scanner.nextLine());

        }
    }
}
