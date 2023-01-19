package exam.Mid;

import java.util.Scanner;

public class JF0501BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numStudents = Integer.parseInt(scanner.nextLine());
        int numLectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());
        int topStudent = 0;
        double maxBonus = 0;
        for (int i = 1; i <=numStudents; i++) {
            int student = Integer.parseInt(scanner.nextLine());
            if(topStudent <= student){
                topStudent = student;
                maxBonus = Math.ceil((topStudent * 1.0/ numLectures) * (5 + bonus));
            }
        }
        System.out.printf("Max Bonus: %.0f.%n",maxBonus);
        System.out.printf("The student has attended %d lectures.",topStudent);
    }
}
