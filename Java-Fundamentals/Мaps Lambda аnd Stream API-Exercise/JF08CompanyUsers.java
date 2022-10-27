package mapsLambdaAndStreamAPIExercise;

import java.util.*;

public class JF08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String, List<String>>  mapCompany= new LinkedHashMap<>();
        while (!input.equals("End")){
            String [] data = input.split(" -> ");
            if(mapCompany.containsKey(data[0])){
                List<String> employees = mapCompany.get(data[0]);
                if(!employees.contains(data[1])){
                    employees.add(data[1]);
                }
            }
            else {
                List<String> employees = new ArrayList<>();
                employees.add(data[1]);
                mapCompany.put(data[0],employees);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String,List<String>> entry : mapCompany.entrySet()) {
            System.out.printf("%s%n-- %s%n",entry.getKey(),String.join("\n-- ",entry.getValue()));
        }
    }
}
