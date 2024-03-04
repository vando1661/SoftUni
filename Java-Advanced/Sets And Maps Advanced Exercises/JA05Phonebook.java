package Java_Advance._6SetsAndMapsAdvancedExercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class JA05Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("search")) {
            String text = input;
            String name = text.split("-")[0];
            String phoneNumber = text.split("-")[1];
            phoneBook.put(name, phoneNumber);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("stop")) {
            String people = input;
            if (phoneBook.containsKey(people)) {
                System.out.println(people + " -> " + phoneBook.get(people));
            } else {
                System.out.println("Contact " + people + " does not exist.");
            }
            input = scanner.nextLine();
        }

    }
}
