package exam.Final;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JF0502EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String regexCorrectWord = "(?<first>[*]{2}[A-Z]{1}[a-z]{2,}[*]{2}|[:]{2}[A-Z]{1}[a-z]{2,}[:]{2})";
        String regexDigits = "\\d";
        String input = scanner.nextLine();
        int coolTotal = 1;

        Pattern patternCorrectWord = Pattern.compile(regexCorrectWord);
        Pattern patternDigits = Pattern.compile(regexDigits);
        List<String> emoji = new ArrayList<>();
        List<String> alleEmoji = new ArrayList<>();
        Matcher matcherDigits = patternDigits.matcher(input);
        while (matcherDigits.find()){
            int diggit = Integer.parseInt(matcherDigits.group(0));
            coolTotal= coolTotal * diggit;
        }
        Matcher matcherCorrectWord = patternCorrectWord.matcher(input);
        while (matcherCorrectWord.find()){
            String name = matcherCorrectWord.group("first");
            int sumChar = 0;
            for (int i = 2; i <name.length()-2; i++) {
                char symbol = name.charAt(i);
                sumChar+= (int)symbol;

            }
            alleEmoji.add(name);
            if(sumChar > coolTotal){
                emoji.add(name);
            }

        }
        System.out.printf("Cool threshold: %d%n",coolTotal);
        System.out.printf("%d emojis found in the text. The cool ones are:%n",alleEmoji.size());
        for (String e:emoji) {
            System.out.printf("%s%n",e);

        }
    }
}
