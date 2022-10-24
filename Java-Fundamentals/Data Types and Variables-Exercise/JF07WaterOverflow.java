package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class JF07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int allLiters = 0;
        for (int i = 1; i <=n; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            allLiters+= liters;
            if (allLiters > capacity) {
                System.out.println("Insufficient capacity!");
                allLiters-= liters;
            }
        }
        System.out.println(allLiters);
    }
}
