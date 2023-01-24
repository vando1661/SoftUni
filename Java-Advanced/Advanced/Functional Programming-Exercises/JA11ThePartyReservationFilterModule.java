package _10FunctionalProgrammingExercises;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JA11ThePartyReservationFilterModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> partyList = Arrays.stream(scanner.nextLine()
                .split("\\s+")).collect(Collectors.toList());
        Set<String> filters = new HashSet<>();
        String text = scanner.nextLine();
        while (!text.equals("Print")){
            String [] data = text.split(";");
            String command = data[0];
            String type = data[1];
            String parameter = data[2];
            if(command.equals("Add filter")){
                filters.add(type + ";" + parameter);

            }else {
                filters.remove(type + ";" + parameter);
            }
            text = scanner.nextLine();
        }
       filters.forEach(filter -> {
           Predicate<String> filterToApply = getPericate(filter);
           partyList.removeIf(filterToApply);

       });
        partyList.forEach(name -> System.out.print(name + " "));

    }

    private static Predicate<String> getPericate(String filter) {
        String [] filterParts = filter.split(";");
        String filterType = filterParts[0];
        String parameter = filterParts[1];
        switch (filterType){
            case "Starts with":
                return s -> s.startsWith(parameter);
            case "Ends with":
                return s -> s.endsWith(parameter);
            case "Length":
                return s -> s.length() == Integer.parseInt(parameter);
            case "Contains":
                return s -> s.contains(parameter);
        }
        return null;
    }
}
