package basicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class JF05MonthPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int month = Integer.parseInt(scanner.nextLine());
        String months = "";
        switch (month){
            case 1:
                months = "January";
                break;
            case 2:
                months = "February";
                break;
            case 3:
                months = "March";
                break;
            case 4:
                months = "April";
                break;
            case 5:
                months = "May";
                break;
            case 6:
                months = "June";
                break;
            case 7:
                months = "July";
                break;
            case 8:
                months = "August";
                break;
            case 9:
                months = "September";
                break;
            case 10:
                months = "October";
                break;
            case 11:
                months = "November";
                break;
            case 12:
                months = "December";
                break;
            default:
                System.out.println("Error!");
                break;
        }
        System.out.println(months);

    }
}
