package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class JF11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //Every  2 lost game, Peter trashes his headset.
        //Every 3 lost game, Peter trashes his mouse.
        //When Peter trashes both his mouse and headset in the same lost game,
        // he also trashes his keyboard.
        //Every 2 time, when he trashes his keyboard, he also trashes his display.
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double total = 0;
        double countHeadset = 0;
        double countMouse = 0;
        double countKeyboard = 0;
        double countDisplay = 0;
        //countHeadset = Math.round(lostGames * 1.0) / 2;
        for (int i = 1; i <=lostGames ; i++) {
            if(i % 2 ==0){
                countHeadset++;
            }
        }
        for (int i = 1; i <=lostGames ; i++) {
            if(i %3 == 0){
                countMouse++;
            }

        }
        //countMouse = Math.round(lostGames * 1.0) / 3;
        for (int i = 1; i <= lostGames ; i++) {
            if (i % 2 == 0 && i % 3 == 0){
                countKeyboard++;
            }
        }
        for (int i = 1; i <= countKeyboard ; i++) {
            if (i % 2 == 0){
                countDisplay++;
            }
        }
        total = (headsetPrice * countHeadset) + (mousePrice * countMouse) + (keyboardPrice * countKeyboard) + (displayPrice * countDisplay);
        System.out.printf("Rage expenses: %.2f lv.",total);



    }
}

