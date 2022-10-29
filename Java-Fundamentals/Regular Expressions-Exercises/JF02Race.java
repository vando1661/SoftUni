package regularExpressionsExercises;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class JF02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String names = scanner.nextLine();
        List <String> nameList = Arrays.stream(names.split(", "))
                .collect(Collectors.toList());
        Map<String, Integer> racersMap = new LinkedHashMap<>();
        nameList.forEach(name -> racersMap.put(name,0));
        String regexLetters = "[A-Za-z]+";
        Pattern patternLetters = Pattern.compile(regexLetters);
        String regexDigit = "[0-9]";
        Pattern patternDigit = Pattern.compile(regexDigit);

        String input = scanner.nextLine();
        while (!input.equals("end of race")){
            StringBuilder nameBuilder = new StringBuilder();
            Matcher matcherLetter = patternLetters.matcher(input);
            while (matcherLetter.find()){
                nameBuilder.append(matcherLetter.group());
            }
            int distane = 0;
            Matcher matcherDigit = patternDigit.matcher(input);
            while (matcherDigit.find()){
                distane+= Integer.parseInt(matcherDigit.group());
            }
            String racerName = nameBuilder.toString();
            if(racersMap.containsKey(racerName)){
                int currentDistance = racersMap.get(racerName);
                racersMap.put(racerName,currentDistance + distane);
            }
            input = scanner.nextLine();
        }
        List<String> nameOfFirstThree = racersMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println("1st place: " + nameOfFirstThree.get(0));
        System.out.println("2nd place: " + nameOfFirstThree.get(1));
        System.out.println("3rd place: " + nameOfFirstThree.get(2));
    }
}
