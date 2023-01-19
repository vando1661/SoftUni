package exam.Final;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JF0102AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "(?<symbols>[#\\|])(?<name>[A-za-z\\s]+)(\\1)(?<date>[0-9]{2}[\\/][0-9]{2}[\\/][0-9]{2})(\\1)(?<calories>[\\d]{1,5})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int countCalories = 0;
        Map<String,String> foodDate = new LinkedHashMap<>();
        Map<String,Integer> foodCalories = new LinkedHashMap<>();
        List<String> listItems = new ArrayList<>();
        while (matcher.find()){
            String food = matcher.group("name");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));
            foodDate.putIfAbsent(food,date);
            foodCalories.putIfAbsent(food,calories);
            countCalories += calories;
            listItems.add(String.format("Item: %s, Best before: %s, Nutrition: %d%n",food,date,calories));

           /* int sum = 0;
            for (Map.Entry<String,Integer> entry : foodCalories.entrySet()) {
                sum += entry.getValue();
            }*/
        }
        System.out.printf("You have food to last you for: %d days!%n",countCalories /2000);
        listItems.forEach(System.out::printf);
    }
}
