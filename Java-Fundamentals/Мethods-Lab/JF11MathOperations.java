package methodsLab;

import java.util.Scanner;

public class JF11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int num1Input = Integer.parseInt(scanner.nextLine());
        String operatorInput = scanner.nextLine();
        int num2Input = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.0f",calculate(num1Input,operatorInput,num2Input));

    }
    private static double calculate (int num1, String operator, int num2){
         int result = 0;
        if(operator.equals("/")){
            result = num1 / num2;
        }else if (operator.equals("*")){
            result = num1 * num2;
        }else if (operator.equals("+")){
            result = num1 + num2;
        }else if (operator.equals("-")){
            result = num1 - num2;
        }
        return result;
    }
}
