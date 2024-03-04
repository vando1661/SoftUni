package Java_Advance._14Generics_Exercises.JA02GenericBoxOfInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Box<String> box = new Box();
        for (int i = 0; i < n; i++) {
            String elements = scanner.nextLine();
            box.add(elements);
        }
        System.out.print(box);
    }

}
