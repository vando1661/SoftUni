package basicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class JF09SumOfOddNumbers {
    public static void main(String[] args) {


    Scanner scanner = new Scanner (System.in);
    int n = Integer.parseInt(scanner.nextLine());
    int sum = 0;
    //int number = 1;
        for (int i = 0; i < n; i++) {
            int odd = 1 + i * 2;
            System.out.println(odd);
            sum += odd;

        }
        System.out.printf("Sum: %d",sum);
  }
}