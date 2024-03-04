package _14Generics_Exercises.JA06GenericCountMethodDouble;

import _14Generics_Exercises.JA05GenericCountMethodString.Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Box<Double> box = new Box<>();
        for (int i = 0; i < num; i++) {
            Double element = Double.parseDouble(scanner.nextLine());
            box.add(element);
        }
        Double elementToCompareTo = Double.parseDouble(scanner.nextLine());
        System.out.println(box.countOgGreater(elementToCompareTo));
    }
    }

