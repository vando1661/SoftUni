package Java_OOP._02WorkingWithAbstraction_Exercise;

import Java_OOP._02WorkingWithAbstraction_Exercise.CardRanks;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*System.out.println("Card Suits:");
        for (CardSuits cardSuits: CardSuits.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",cardSuits.ordinal(),cardSuits.name());
        }*/

        /*System.out.println("Card Ranks:");
        Arrays.stream(CardRanks.values())
                .forEach(cardRanks -> System.out.printf("Ordinal value: %d; Name value: %s%n",cardRanks.ordinal(),cardRanks.name()));*/
        Scanner scanner = new Scanner(System.in);
        CardRanks cardRanks = CardRanks.valueOf(scanner.nextLine());
        CardSuits cardSuits = CardSuits.valueOf(scanner.nextLine());
        Card card = new Card(cardSuits,cardRanks);
        System.out.printf("Card name: %s of %s; Card power: %d",card.getCardRanks(),card.getCardSuits(),card.getPower());
    }
}
