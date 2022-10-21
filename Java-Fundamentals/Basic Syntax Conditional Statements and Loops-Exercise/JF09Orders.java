package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class JF09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int nOrders = Integer.parseInt(scanner.nextLine());
        double allTotal = 0;
        for (int i = 1; i <=nOrders ; i++) {
            double pricePerCapsule =  Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCapsules = Integer.parseInt(scanner.nextLine());
            double total = 0;
            total = days * countCapsules * pricePerCapsule;
            allTotal+= total;
            System.out.printf("The price for the coffee is: $%.2f%n",total);
        }
        System.out.printf("Total: $%.2f",allTotal);
    }
}
