package mapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class JF02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String resource = scanner.nextLine();
        Map<String,Integer> resourceQuantity = new LinkedHashMap<>();
        while (!resource.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());

            if(!resourceQuantity.containsKey(resource)){
                resourceQuantity.put(resource,quantity);
            }else {
                int currentQuantity = resourceQuantity.get(resource);
                resourceQuantity.put(resource,currentQuantity + quantity);
            }
            resource = scanner.nextLine();
        }
        for (Map.Entry<String,Integer> entry : resourceQuantity.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }
    }
}
