package _14Generics_Exercises.JA03GenericSwapMethodString;

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
        String [] indices = scanner.nextLine().split(" ");
        int firstIndex = Integer.parseInt(indices[0]);
        int secondIndex = Integer.parseInt(indices[1]);
        box.swap(firstIndex,secondIndex);
        System.out.print(box);
    }
}
