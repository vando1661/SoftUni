package _5SetsAndMapsAdvanced_Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class JA06ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        Map<String,Map<String,Double>> mapShop = new TreeMap<>();
        while (!input.equals("Revision")){
            String shop = input.split(", ")[0];
            String product = input.split(", ")[1];
            double price = Double.parseDouble(input.split(", ")[2]);
           if(!mapShop.containsKey(shop)){
               mapShop.put(shop,new LinkedHashMap<>());
           } Map<String,Double> mapProducts = mapShop.get(shop);
           mapProducts.put(product,price);
           input = scanner.nextLine();
        }
        mapShop.entrySet().stream()
                .forEach(shops -> {
                    System.out.println(shops.getKey() + "->");
                    shops.getValue().entrySet().stream()
                            .forEach(products -> {
                                System.out.printf("Product: %s, Price: %.1f%n",products.getKey(),products.getValue());
                               // System.out.println("Product: " + products.getKey() + ", Price: " + products.getValue());
                            });
                });
    }
}
