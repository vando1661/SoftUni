package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class JF03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int allPeople = Integer.parseInt(scanner.nextLine());
        int capacityElevate = Integer.parseInt(scanner.nextLine());
        double courses = 0;
        courses = Math.ceil(allPeople * 1.0 / capacityElevate);
        System.out.printf("%.0f",courses);

    }
}
