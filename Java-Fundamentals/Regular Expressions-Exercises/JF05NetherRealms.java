package regularExpressionsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class JF05NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<String> inputList = Arrays.stream(scanner.nextLine().split("[, ]+"))
                .collect(Collectors.toList());
        String nameRegex = "([^0-9+\\-*\\/.])";
        String damageRegex = "(\\-?\\+?[0-9]+[\\.]?[0-9]*)";
        Pattern namePattern = Pattern.compile(nameRegex);
        Pattern damagePattern = Pattern.compile(damageRegex);
        for (String demon:inputList) {
            Matcher matcherName = namePattern.matcher(demon);
            int health = 0;
            while (matcherName.find()){
                health+=matcherName.group().charAt(0);
            }
            Matcher matcherDamage = damagePattern.matcher(demon);
            double damage = 0.0;
            while (matcherDamage.find()){
                damage+= Double.parseDouble(matcherDamage.group());
            }
            for (char symbol : demon.toCharArray()) {
                if(symbol == '*'){
                    damage *= 2;
                }else if (symbol == '/'){
                    damage /=2;
                }
            }

            System.out.printf("%s - %d health, %.2f damage%n",demon,health,damage);
        }
    }
}
