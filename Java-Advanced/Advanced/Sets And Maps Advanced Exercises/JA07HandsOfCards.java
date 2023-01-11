package Java_Advance._6SetsAndMapsAdvancedExercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class JA07HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String,Integer> playersMap = new LinkedHashMap<>();
        while (!input.equals("JOKER")){
            String [] text = input.split(":");
            String name = text[0];
            String cards = text[1];
            String [] cardHand = cards.trim().split(", ");
            int cardsPoints = 0;
            for (int index = 0; index < cardHand.length; index++) {
               String cardAndColor = cardHand[index];
               int num = Integer.parseInt(cardAndColor.split("")[0]);
               String color = cardAndColor.split("")[1];
               int sum = 0;
               if(color.equals("C")){
                   int currentPoint = 1;
                   sum = currentPoint + num;
                   continue;
               }else if(color.equals("S")){
                   int currentPoint = 4;
                   sum = currentPoint + num;
                   continue;
               }else if(color.equals("H")){
                   int currentPoint = 3;
                   sum = currentPoint + num;
                   continue;
               }else if(color.equals("D")){
                   int currentPoint = 2;
                   sum = currentPoint + num;
                   continue;
               }


            }

            input = scanner.nextLine();
        }

    }
}
