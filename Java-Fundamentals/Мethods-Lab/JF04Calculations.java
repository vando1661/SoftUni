package methodsLab;

import java.util.Scanner;

public class JF04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String command = scanner.nextLine();
        int numOneInput = Integer.parseInt(scanner.nextLine());
        int numTwoInput = Integer.parseInt(scanner.nextLine());
        switch (command){
            case "add":
                addNum(numOneInput , numTwoInput);
                break;
            case "multiply":{
                multiplyNum(numOneInput,numTwoInput);
                break;
            } case "subtract":{
                subtractNum(numOneInput,numTwoInput);
                break;
            } case "divide":{
                divideNum(numOneInput,numTwoInput);
                break;
            }
        }
    }
    public static void addNum (int numOne, int numTwo){
        int result = numOne + numTwo;
        System.out.println(result);
    }
    public static void multiplyNum(int numOne, int numTwo){
        int result = numOne * numTwo;
        System.out.println(result);
    }
    public static void subtractNum(int numOne, int numTwo){
        int result = numOne - numTwo;
        System.out.println(result);
    }
    public static void divideNum(int numOne, int numTwo){
        int result = numOne / numTwo;
        System.out.println(result);
    }
}
