package Java_Advance._6SetsAndMapsAdvancedExercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class JA06FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        LinkedHashMap <String,String> emailMap = new LinkedHashMap<>();
        while (!input.equals("stop")){
            String name = input;
            String email = scanner.nextLine();
            if(!email.contains(".us") && !email.contains(".uk") && !email.contains(".com")){
                emailMap.put(name,email);
            }
            input = scanner.nextLine();
        }
        for (String email:emailMap.keySet()) {
            System.out.println(email + " -> " + emailMap.get(email));
        }
    }
}
