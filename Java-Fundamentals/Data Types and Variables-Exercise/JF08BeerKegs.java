package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class JF08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numKeg = Integer.parseInt(scanner.nextLine());
        double maxKeg = Integer.MIN_VALUE;
        String currentModel = "";
        //     π * r^2 * h

        for (int i = 1; i <= numKeg ; i++) {
            String model = scanner.nextLine();
            double  radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volumeKeg = Math.PI *  Math.pow(radius,2) * height;
            if(volumeKeg > maxKeg){
                maxKeg = volumeKeg;
                currentModel = model;
            }
        }
        System.out.println(currentModel);
    }
}
