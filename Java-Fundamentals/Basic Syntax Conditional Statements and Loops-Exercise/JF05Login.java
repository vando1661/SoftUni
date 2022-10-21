package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class JF05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String correctPass = "";
        int counter = 0;
        for (int i = username.length() - 1; i >= 0; i--) {
            correctPass += username.charAt(i);
        }
        String password = scanner.nextLine();
        while (true) {
            counter++;
            if (password.equals(correctPass)) {
                System.out.printf("User %s logged in.",username);
                break;
            } else {
                if (counter == 4)  {
                    System.out.printf("User %s blocked!",username);
                    break;
                }
                System.out.println("Incorrect password. Try again.");
            }
            password = scanner.nextLine();

        }
    }
}
