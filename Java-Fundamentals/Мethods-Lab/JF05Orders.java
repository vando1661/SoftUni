package methodsLab;

import java.util.Scanner;

public class JF05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String productInput = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        switch (productInput){
            case "coffee":
                printCoffeeSum(quantity);
                break;
            case "water":
                printWaterSum(quantity);
                break;
            case "coke":
                printCokeSum(quantity);
                break;
            case "snacks":
                printSnacksSum(quantity);
                break;
        }
    }
    public static void printCoffeeSum(int num){
       double sum = 1.5 * num;
        System.out.printf("%.2f",sum);
    }
    public static void printWaterSum(int num){
        double sum = 1.0 * num;
        System.out.printf("%.2f",sum);
    }
    public static void printCokeSum(int num){
        double sum = 1.4 * num;
        System.out.printf("%.2f",sum);
    }
    public static void printSnacksSum(int num){
        double sum = 2.0 * num;
        System.out.printf("%.2f",sum);
    }
}
