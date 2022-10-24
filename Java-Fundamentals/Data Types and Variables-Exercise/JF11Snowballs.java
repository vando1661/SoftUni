package dataTypesAndVariablesExercise;

import java.util.Scanner;

public class JF11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double masSnowballValue = Double.MIN_VALUE;
        int maxsnowBallSnow = Integer.MIN_VALUE;
        int maxsnowBallTime = Integer.MIN_VALUE;
        int maxsnowBallQuality = Integer.MIN_VALUE;
        for (int i = 1; i <=number ; i++) {
            int snowBallSnow = Integer.parseInt(scanner.nextLine());
            int snowBallTime = Integer.parseInt(scanner.nextLine());
            int snowBallQuality = Integer.parseInt(scanner.nextLine());
           double  snowballValue = Math.pow(snowBallSnow / snowBallTime,snowBallQuality);
           if (snowballValue> masSnowballValue){
               masSnowballValue = snowballValue;
               maxsnowBallSnow = snowBallSnow;
               maxsnowBallTime = snowBallTime;
               maxsnowBallQuality = snowBallQuality;
           }
        }
        System.out.printf("%d : %d = %.0f (%d)",maxsnowBallSnow,maxsnowBallTime,masSnowballValue,maxsnowBallQuality);

    }
}
