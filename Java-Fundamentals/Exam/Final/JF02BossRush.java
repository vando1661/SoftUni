package exam.Final;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JF02BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "(\\|)(?<name>[A-Z]{4,})(\\1):#(?<title>[A-Z][a-z]+ [A-za-z]+)#";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 1; i <= n; i++) {
            String text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);
            if(matcher.find()){
                String name = matcher.group("name");
                String title = matcher.group("title");
                int strength = matcher.group("name").length();
                int armor = matcher.group("title").length();
                System.out.printf("%s, The %s%n",name,title);
                System.out.println(">> Strength: " + strength);
                System.out.println(">> Armor: " + armor);
            }
            else {
                System.out.println("Access denied!");
            }
        }
    }
}
