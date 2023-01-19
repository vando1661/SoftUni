package exam.Mid;

import java.util.Scanner;

public class JF0201SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int allStudents = Integer.parseInt(scanner.nextLine());
        int studentsPerHour = first + second + third;
        int hours = 0;
        while (allStudents > 0){
            allStudents -=studentsPerHour;
            hours++;
            if(hours % 4 ==0){
                hours++;
            }
        }
        System.out.printf("Time needed: %dh.",hours);
    }
}
