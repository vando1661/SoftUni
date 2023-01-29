package _14Generics_Exercises.JA05GenericCountMethodString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Box<Integer> box = new Box<>();
        for (int i = 0; i < num; i++) {
            Integer element = Integer.parseInt(scanner.nextLine());
            box.add(element);
        }
        int elementToCompareTo = Integer.parseInt(scanner.nextLine());
        System.out.println(box.countOgGreater(elementToCompareTo));
    }
}
