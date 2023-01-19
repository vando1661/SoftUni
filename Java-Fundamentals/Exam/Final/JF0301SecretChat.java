package exam.Final;

import java.util.Scanner;
import java.util.regex.Pattern;

public class JF0301SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        StringBuilder secretBuilder = new StringBuilder();
        secretBuilder.append(input);
        while (!input.equals("Reveal")){
            String [] textArray = input.split("(:+\\|+:+)");
            String command = textArray[0];
            switch (command) {
                case "InsertSpace":
                    String symbol = " ";
                    int index = Integer.parseInt(textArray[1]);
                    secretBuilder.insert(index,symbol);
                    System.out.println(secretBuilder);
                    break;
                case "Reverse":
                   String substring = textArray[1];
                   StringBuilder sb = new StringBuilder();
                    sb.append(substring).reverse();
                    String stBuilder = sb.toString();
                    String builder = secretBuilder.toString();
                    if(builder.contains(substring)){
                        //input = input.replaceFirst(Pattern.quote(forCheck), "") + forReplays;
                        //                    System.out.println(input);
                        builder = builder.replaceAll(Pattern.quote(substring), "") + stBuilder;
                        StringBuilder newSB = new StringBuilder();
                        newSB.append(builder);
                        secretBuilder = newSB;

                        System.out.println(secretBuilder);
                    }else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    StringBuilder sb1 = new StringBuilder();
                    String substring1 = textArray[1];
                    String replacement = textArray[2];
                    String stBuilder1 = secretBuilder.toString();
                    if(stBuilder1.contains(substring1)){
                        stBuilder1 = stBuilder1.replace(substring1,replacement);
                        sb1.append(stBuilder1);
                        secretBuilder = sb1;
                        System.out.println(secretBuilder);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s%n",secretBuilder);

    }
}
