package listsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JF06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        List<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        while (firstPlayerCards.size()!=0 && secondPlayerCards.size()!=0){
            int firstCards = firstPlayerCards.get(0);
            int secondCards = secondPlayerCards.get(0);
            firstPlayerCards.remove(0);
            secondPlayerCards.remove(0);
            if(firstCards > secondCards){
                firstPlayerCards.add(firstCards);
                firstPlayerCards.add(secondCards);
            }else if(secondCards > firstCards){
                secondPlayerCards.add(firstCards);
                secondPlayerCards.add(secondCards);
            }
        }
        if(firstPlayerCards.size() == 0){
            System.out.printf("Secund player wins! Sum: %d",cardSum(secondPlayerCards));
        }
        else if (secondPlayerCards.size() == 0){
            System.out.printf("First player wins! Sum: %d",cardSum(firstPlayerCards));
        }
    }

    public static int cardSum(List<Integer> listCards){
        int sum = 0;
        for (int card : listCards) {
            sum+=card;
        }
        return sum;
    }
}
