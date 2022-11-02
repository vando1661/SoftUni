package _2StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class JA05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brackets = scanner.nextLine();
        ArrayDeque<Character> startBrackets = new ArrayDeque<>();
        ArrayDeque<Character> endBrackets = new ArrayDeque<>();
        boolean isTrue = true;
        for (int i = 0; i < brackets.length(); i++) {
            char currentBracket = brackets.charAt(i);
            if (currentBracket == '{' || currentBracket == '(' || currentBracket == '[') {
                startBrackets.push(currentBracket);
            } else {
                if(startBrackets.isEmpty()){
                    isTrue = false;
                    break;
                }
                char lastBracket = startBrackets.pop();
                if (currentBracket == ')' && lastBracket != '(') {
                    isTrue = false;

                } else if (currentBracket == '}' && lastBracket != '{') {
                    isTrue = false;
                } else if (currentBracket == ']' && lastBracket != '[') {
                    isTrue = false;
                }
            }
        }
        if(isTrue){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}