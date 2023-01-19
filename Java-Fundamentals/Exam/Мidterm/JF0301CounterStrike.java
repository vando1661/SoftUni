package exam.Mid;

import java.util.Scanner;

public class JF0301CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int live = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int count = 0;
        while (!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);
            if (live < distance) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", count, live);
                return;
            }
                live = live - distance;
                count++;
            if (count% 3 == 0) {
                    live+= count;
                }
          input = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d", count, live);
    }
}
