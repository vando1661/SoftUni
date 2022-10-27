package methodsExercise;

import java.util.Scanner;

public class JF09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        while (!text.equals("END")) {
            if (!isPalindrome(text)) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
            text = scanner.nextLine();
        }
    }
    private static boolean isPalindrome (String input){
        String reversed = "";
        for (int i = input.length()-1; i >=0 ; i--) {
            reversed += input.charAt(i);
        }
         return input.equals(reversed);

        }


    }

