package exam.Mid;

import java.util.Scanner;

public class JF0401GuineaPigEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            double foodKg = Double.parseDouble(scanner.nextLine());
            double hayKg = Double.parseDouble(scanner.nextLine());
            double coverKg = Double.parseDouble(scanner.nextLine());
            double pigKg = Double.parseDouble(scanner.nextLine());
            double foodGr = foodKg * 1000;
            double hayGr = hayKg * 1000;
            double coverGr = coverKg * 1000;
            double pigGr = pigKg * 1000;
            int days = 1;
            // int day = 1;
            while (days <= 30) {
                foodGr -= 300;
                if (days % 2 == 0) {
                    hayGr -= foodGr * 0.05;
                }if (days % 3 == 0) {
                    coverGr -= pigGr * 0.3333;
                    //day = 0;
                }
                //day++;
                days++;
            }if(foodGr >= 0 && hayGr >= 0 && coverGr >= 0 ){
                System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",foodGr/1000,hayGr/1000,coverGr/1000);
            }else if( foodGr < 0 || hayGr < 0 || coverGr < 0){
                System.out.println("Merry must go to the pet store!");
            }
        }

}

