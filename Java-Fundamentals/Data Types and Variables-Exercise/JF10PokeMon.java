package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class JF10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int nPower = Integer.parseInt(scanner.nextLine());
        int mDistance = Integer.parseInt(scanner.nextLine());
        int yExhaustionFactor = Integer.parseInt(scanner.nextLine());
        double startPower = nPower;
        int poke = 0;
        while (nPower >= mDistance){
            nPower = nPower - mDistance;
            poke++;
            if(nPower == startPower * 0.5){
               if(yExhaustionFactor >0) {
                   nPower = nPower / yExhaustionFactor;
               }
            }
        }
        System.out.println(nPower);
        System.out.println(poke);

    }
}
