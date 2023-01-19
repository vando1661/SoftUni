package exam.Mid;

import java.util.Scanner;

public class JF01ExperienceGaining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double neededExp = Double.parseDouble(scanner.nextLine());
        int countBattles = Integer.parseInt(scanner.nextLine());
        double  experience = 0;
        int count = 0;

             for (int i = 1; i <=countBattles; i++) {
            double line = Double.parseDouble(scanner.nextLine());
            count++;
            if (i % 3 == 0) {
                experience = experience + (line * 1.15);
                if (i % 15 == 0) {
                    experience = experience + (line * 1.05);
                }

            } else if (i % 5 == 0) {
                experience = experience + (line * 0.9);

            } else {
                experience = experience + line;
            }if(experience >=neededExp){
                break;
            }
        }
        if(experience >= neededExp ){
            System.out.printf("Player successfully collected his needed experience for %d battles.",count);
        }else {
            double diff = neededExp - experience;
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.",diff);
        }
    }
}
