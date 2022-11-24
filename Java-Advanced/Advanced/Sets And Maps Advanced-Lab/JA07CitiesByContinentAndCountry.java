package _5SetsAndMapsAdvanced_Lab;

import java.util.*;

public class JA07CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Map<String, List<String>>> continentsMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String continent = input.split(" ")[0];
            String country = input.split(" ")[1];
            String city = input.split(" ")[2];
            if(!continentsMap.containsKey(continent)){
                continentsMap.put(continent,new LinkedHashMap<>());
            }
            Map<String,List<String>> countryMap = continentsMap.get(continent);
            countryMap.putIfAbsent(country,new ArrayList<>());
            List<String> citiesList = countryMap.get(country);
            citiesList.add(city);

        }
        continentsMap.entrySet()
                .stream()
                .forEach(continents ->{
                    System.out.println(continents.getKey() + ":");
                    continents
                            .getValue()
                            .entrySet()
                            .stream()
                            .forEach(countries -> {
                                String cities =  String.join(", ",countries.getValue());
                                System.out.printf(" %s -> %s%n",countries.getKey(),cities);

                            });
                });

    }
}
