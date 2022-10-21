package basicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class JF11MultiplicationTable20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        for (int i = num2; i <= 10; i++) {
            int times = 0;
            times = times + i;
            int sum = 0;
            sum = num1 * times;
            System.out.printf("%d X %d = %d%n",num1,times,sum);
        }if (num2 > 10){
            int sum = 0;
            sum = num1 * num2;
            System.out.printf("%d X %d = %d",num1,num2,sum);
        }

    }
}
