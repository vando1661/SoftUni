package _14Generics_Exercises.JA04GenericSwapMethodInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Box<Integer> box = new Box<>();
        for (int i = 0; i < num; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            box.add(number);
        }
        String[] indices = scanner.nextLine().split(" ");
        int firstIndex = Integer.parseInt(indices[0]);
        int secondIndex = Integer.parseInt(indices[1]);
        box.swap(firstIndex, secondIndex);
        System.out.println(box);
    }
}
