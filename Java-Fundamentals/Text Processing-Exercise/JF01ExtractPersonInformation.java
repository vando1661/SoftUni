package textProcessingMoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JF01ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String name = "";
        String age = "";
        for (int i = 1; i <= num ; i++) {
            String text = scanner.nextLine();
            String regexName = "@(?<name>[A-Za-z]+)\\|";
            String regexAge = "#(?<age>[0-9]+)\\*";
            Pattern patternName = Pattern.compile(regexName);
            Matcher matcherName = patternName.matcher(text);
            Pattern patternAge = Pattern.compile(regexAge);
            Matcher matcherAge = patternAge.matcher(text);
            while (matcherName.find() && matcherAge.find()){
                name = matcherName.group("name");
                age = matcherAge.group("age");
            }
            System.out.printf("%s is %s years old.%n",name,age);
        }
    }
}
