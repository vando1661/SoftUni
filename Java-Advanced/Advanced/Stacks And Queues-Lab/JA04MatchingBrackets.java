package _1StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class JA04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String express = scanner.nextLine();
        ArrayDeque<Integer> open = new ArrayDeque<>();
        for (int i = 0; i < express.length(); i++) {
            char currentSymbol = express.charAt(i);
            if(currentSymbol == '('){
                open.push(i);

            }else if (currentSymbol == ')'){
                int lastOpen = open.pop();
                String matching = express.substring(lastOpen,i + 1);
                System.out.println(matching);

            }
        }

    }
}
