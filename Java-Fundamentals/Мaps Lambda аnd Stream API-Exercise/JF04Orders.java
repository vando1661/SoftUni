package mapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class JF04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        Map<String, Double> productPrice = new LinkedHashMap<>();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();
        while (!input.equals("buy")){
            String item = input.split(" ")[0];
            double price  = Double.parseDouble((input.split(" "))[1]);
            int quantity = Integer.parseInt((input.split(" "))[2]);
            productPrice.put(item,price);
            if(!productQuantity.containsKey(item)){
                productQuantity.put(item,quantity);
            }else {
                productQuantity.put(item,productQuantity.get(item)+quantity);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String,Double> entry: productPrice.entrySet()) {
            String productName = entry.getKey();
            double finalSum = entry.getValue() * productQuantity.get(productName);
            System.out.printf("%s -> %.2f%n",productName,finalSum);

        }
    }
}
