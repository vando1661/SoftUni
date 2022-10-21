package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class JF10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //sabers buy 10% more, rounded up to the next integer.
        // Also, every sixth belt is free.
        double money = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double sabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());
        double total = 0;
        double sabers = 0;
        double robes = 0;
        double belts = 0;
        sabers = Math.ceil(countStudents * 1.1 ) * sabersPrice;
        robes = countStudents * robesPrice;
        belts = (countStudents - Math.floor(countStudents * 1.0 / 6)) * beltsPrice;
        total = sabers + robes + belts;
        if(total > money){
            double needMoney = total - money;
            System.out.printf("George Lucas will need %.2flv more.",needMoney);
        }else {
            System.out.printf("The money is enough - it would cost %.2flv.",total);

        }
    }
}
