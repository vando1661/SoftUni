package methodsLab;

import java.util.Scanner;

public class JF07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String textInput = scanner.nextLine();
        int repeatNum = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(textInput,repeatNum));
    }
    public static String repeatString(String textRepeat ,int n){
        String result ="";
        for (int i = 1; i <=n; i++) {
            result = result + textRepeat;

        }
        return result;
    }

}
