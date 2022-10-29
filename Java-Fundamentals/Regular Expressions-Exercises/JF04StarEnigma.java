package regularExpressionsExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JF04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n  = Integer.parseInt(scanner.nextLine());
        String regex = "@(?<planet>[A-Za-z]+)[^@!:->]*:(?<population>[0-9]+)[^@!:->]*!(?<attack>[AD])![^@!:->]*->(?<solidersCount>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> attackersPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            String input = scanner.nextLine();
            String decryptText = getDecryptedText(input);
            Matcher matcher = pattern.matcher(decryptText);
            if(matcher.find()){
                String planetName = matcher.group("planet");
                String attack = matcher.group("attack");
                if(attack.equals("A")){
                    attackersPlanets.add(planetName);
                }else if(attack.equals("D")){
                    destroyedPlanets.add(planetName);
                }
            }
        }
        System.out.println("Attacked planets: " + attackersPlanets.size());
        Collections.sort(attackersPlanets);
        attackersPlanets.forEach(planet-> System.out.println("-> " + planet));

        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        Collections.sort(destroyedPlanets);
        destroyedPlanets.forEach(planet-> System.out.println("-> " + planet));

    }
    private static String getDecryptedText(String input){
        int countLetters = getLettersCount(input);
        StringBuilder decryptedBuilder = new StringBuilder();
        for (char symbol : input.toCharArray()) {
            char newSymbol = (char)(symbol - countLetters);
            decryptedBuilder.append(newSymbol);

        }return decryptedBuilder.toString();

    }

    private static int getLettersCount(String input){
        Pattern pattern = Pattern.compile("[STARstar]");
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while (matcher.find()){
            count++;
        }return count;
    }
}
