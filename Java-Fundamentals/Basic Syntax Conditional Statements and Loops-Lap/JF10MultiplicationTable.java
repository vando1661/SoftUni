package basicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class JF10MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= 10; i++) {
            int times = 0;
            times = times + i;
            int sum = 0;
            sum = num * times;
            System.out.printf("%d X %d = %d%n",num,times,sum);
        }

    }
}
