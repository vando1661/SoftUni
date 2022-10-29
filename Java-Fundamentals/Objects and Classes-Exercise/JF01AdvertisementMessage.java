package objectsAndClassesExercise;

import java.util.Random;
import java.util.Scanner;

public class JF01AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String [] phrasesArr = {"Excellent product.", "Excellent product.",
                "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product."};
        String [] eventsArr = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};
        String [] authorsArr = {"Diana", "Petya", "Stella", "Elena",
                "Katya", "Iva", "Annie", "Eva"};
        String [] citiesArr = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random phrases = new Random();
        Random events = new Random();
        Random authors = new Random();
        Random cities = new Random();
        for (int i = 0; i < n; i++) {
            int phrasesIndex = phrases.nextInt(phrasesArr.length);
            int eventsIndex  = events.nextInt(eventsArr.length);
            int authorsIndex = authors.nextInt(authorsArr.length);
            int citiesIndex = cities.nextInt(citiesArr.length);

            System.out.println(String.join(" ",phrasesArr[phrasesIndex] + " " + eventsArr[eventsIndex] + " "+ authorsArr[authorsIndex] + " - " + citiesArr[citiesIndex]));
        }

    }
}
