package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class JF07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //double money = Double.parseDouble(scanner.nextLine());
        double allMoneys = 0;
        String input = scanner.nextLine();
        while (!input.equals("Start")) {
            double moneys = Double.parseDouble(input);;
            if ((moneys == 0.1) || (moneys == 0.2) || (moneys == 0.5) || (moneys == 1) || (moneys == 2)) {
                allMoneys += moneys;
            } else {
                double diffMoneys = 0;
                diffMoneys += moneys;
                System.out.printf("Cannot accept %.02f%n", diffMoneys);
            }
            input = scanner.nextLine();
        }
        String product = scanner.nextLine();
        while (!product.equals("End")){
            boolean hasMoney = true;
            switch(product) {
                case "Nuts":
                    if(allMoneys < 2) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        allMoneys -= 2;
                    }
                    break;
                case "Water":
                    if(allMoneys < 0.7) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        allMoneys -= 0.7;
                    }
                    break;
                case "Crisps":
                    if(allMoneys < 1.5) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        allMoneys -= 1.5;
                    }
                    break;
                case "Soda":
                    if(allMoneys < 0.8) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        allMoneys -= 0.8;
                    }

                    break;
                case "Coke":
                    if(allMoneys < 1) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        allMoneys -= 1;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    hasMoney = false;
                    break;
            }
            if(!hasMoney) {
                product = scanner.nextLine();
                continue;
            }
            System.out.printf("Purchased %s%n", product);


            product = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", allMoneys);
    }
}
