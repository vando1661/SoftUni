package textProcessingLab;

import java.util.Scanner;

public class JF04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] banWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (String word : banWords) {
            if(text.contains(word)){
                text = text.replace(word,repeatStr("*",word.length()));
            }

        }
        System.out.println(text);

    }
    public static String repeatStr(String s, int count){
        String result = "";
        for (int i = 0; i < count; i++) {
            result +=s;
        }
        return  result;
    }
}
