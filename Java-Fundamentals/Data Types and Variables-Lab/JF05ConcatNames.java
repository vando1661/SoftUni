package dataTypesAndVariablesLab;

import java.util.Scanner;

public class JF05ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String nameOne = scanner.nextLine();
        String nameTow = scanner.nextLine();
        String delimiter = scanner.nextLine();
        System.out.printf("%s%s%s",nameOne,delimiter,nameTow);

    }
}
