package dataTypesAndVariablesLab;

import java.math.BigDecimal;
import java.util.Scanner;

public class JF03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal total = new BigDecimal(0);
        for (int i = 1; i <=n ; i++) {
            BigDecimal currentTotal = new BigDecimal(scanner.nextLine());
            total = total.add(currentTotal);
        }
        System.out.println(total);
    }

}
