package basicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class JF13RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < n ; i++) {
            int odd = 2 * i + 1;
            System.out.println(odd);
            sum = sum +odd;
            }
        System.out.printf("Sum: %d",sum);
        }
}
