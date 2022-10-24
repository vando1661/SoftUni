package dataTypesAndVariablesLab;

import java.util.Scanner;

public class JF12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int num = i;
            String tF= "";
            while (num > 0) {
                sum = sum + (num % 10);
                num = num / 10;
            }
            boolean isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            if(isSpecial){
                tF = "True";
            }else {
                tF = "False";
            }
            System.out.printf("%d -> %s%n",i,tF);
            // i = num;
        }

    }
}
