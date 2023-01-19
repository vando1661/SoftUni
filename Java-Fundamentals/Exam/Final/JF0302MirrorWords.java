package exam.Final;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JF0302MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        String regex = "([@#])(?<word>[A-Za-z]{3,})\\1\\1(?<mirror>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> wortList = new ArrayList<>();
        int count = 0;
        while (matcher.find()){
            count++;
            StringBuilder sb = new StringBuilder();
            String wort1 = matcher.group("word");
            String wort2 = matcher.group("mirror");
            //String wort2 =  new StringBuilder(matcher.group("mirror")).reverse().toString();
            sb.append(wort2).reverse();
            String newWort = sb.toString();
            if(wort1.equals(newWort)){
                wortList.add(wort1 +" <=> "+ wort2);

            }
        }if(count == 0){
            System.out.println("No word pairs found!");
        }else {
            System.out.printf("%d word pairs found!%n",count);

        }
        if(wortList.isEmpty()){
            System.out.println("No mirror words!");
        }else {
            System.out.println("The mirror words are:");
            System.out.print(String.join(", ",wortList));

        }



    }
}
