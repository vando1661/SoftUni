package exam.Final;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JF0202DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        String regex = "([=\\/])(?<text>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int travelPoints = 0;
        List<String> stringList = new ArrayList<>();
        while (matcher.find()){
            String destination = matcher.group("text");
            travelPoints = travelPoints + destination.length();
            stringList.add(matcher.group("text"));
        }
        System.out.print("Destinations: ");
        System.out.println(String.join(", ", stringList));
        System.out.printf("Travel Points: %d%n",travelPoints);
    }
}
