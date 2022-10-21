package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class JF03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String groups = scanner.nextLine();
        String days = scanner.nextLine();
        double businessPrice = 0;
        double total = 0;
        switch (days){
            case "Friday":
                switch (groups){
                    case "Students":
                        total = people * 8.45;
                        break;
                    case "Business":
                        total = people * 10.90;
                        businessPrice = 10.90;
                        break;
                    case "Regular":
                        total = people * 15;
                        break;
                }break;
            case "Saturday":
                switch (groups) {
                    case "Students":
                        total = people * 9.80;
                        break;
                    case "Business":
                        total = people * 15.60;
                        businessPrice = 15.60;
                        break;
                    case "Regular":
                        total = people * 20;
                        break;
                }break;
            case "Sunday":
                switch (groups) {
                    case "Students":
                        total = people * 10.46;
                        break;
                    case "Business":
                        total = people * 16;
                        businessPrice = 16;
                        break;
                    case "Regular":
                        total = people * 22.50;
                        break;
                }break;
        }
        if(groups.equals("Students") && people >=30){
            total = total * 0.85;
            System.out.printf("Total price: %.2f",total);
        }else if(groups.equals("Business") && people >=100){
            total = total -(10 * businessPrice);
            System.out.printf("Total price: %.2f",total);
        }else if (groups.equals("Regular") && people >= 10 && people <=20){
            total = total * 0.95;
            System.out.printf("Total price: %.2f",total);
        }else {
            System.out.printf("Total price: %.2f", total);
        }
    }
}
