package _11DefiningClassesLab.JA03BankAccount;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, BankAccount> mapAccount;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        mapAccount = new HashMap<>();
        while (!input.contains("End")) {
            String[] date = input.split("\\s+");
            String command = date[0];
            if (command.contains("Create")) {
                creteAccount(mapAccount);

            } else if (command.contains("Deposit")) {
                int id = Integer.parseInt(date[1]);
                int amount = Integer.parseInt(date[2]);
                deposit(id, amount);

            } else if (command.contains("SetInterest")) {
                double interest = Double.parseDouble(date[1]);
                BankAccount.setInterestRate(interest);
            } else if (command.contains("GetInterest")) {
                int id = Integer.parseInt(date[1]);
                int years = Integer.parseInt(date[2]);
                getInterest(id, years);

            } else {
                throw new IllegalStateException("Unexpected command: " + command);
            }

            input = scanner.nextLine();
        }


    }



    private static void creteAccount(Map<Integer, BankAccount> mapAccount) {
        BankAccount bankAccount = new BankAccount();
        int key = bankAccount.getId();
        mapAccount.put(key, bankAccount);
        System.out.printf("Account ID%d created%n", key);
    }

    private static void deposit(int id, double amount) {
        try {
            BankAccount bankAccount = mapAccount.get(id);
            bankAccount.deposit(amount);
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.printf("Deposited %s to ID%d%n", df.format(amount), bankAccount.getId());
        } catch (NullPointerException e) {
            System.out.println("Account does not exist");
        }
    }

    private static void getInterest(int id, int years) {
        try {
            System.out.printf("%.2f%n", mapAccount.get(id).getInterest(years));
        } catch (NullPointerException e) {
            System.out.println("Account does not exist");
        }
    }
}
