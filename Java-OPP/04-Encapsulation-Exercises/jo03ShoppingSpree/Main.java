package Java_OOP._04EncapsulationExercises.jo03ShoppingSpree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] people = scanner.nextLine().split(";");
        Map<String,Person> peopleMap = new LinkedHashMap<>();
        for (String personalString: people) {
            String [] personalDate = personalString.split("=");
            String name = personalDate[0];
            double money = Double.parseDouble(personalDate[1]);
            try {
                Person person = new Person(name,money);
                peopleMap.put(name,person);
            }catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
                return;
            }
        }
        String [] products = scanner.nextLine().split(";");
        Map<String,Product> productMap = new LinkedHashMap<>();
        for (String productsString:products) {
            String [] productsDate = productsString.split("=");
            String name = productsDate[0];
            double cost = Double.parseDouble(productsDate[1]);
            try {
                Product product = new Product(name,cost);
                productMap.put(name,product);
            }catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
                return;
            }
        }
        String command = scanner.nextLine();
        while (!"END".equals(command)){
            String [] commandsParts = command.split("\\s+");
            String personName = commandsParts[0];
            String productName = commandsParts[1];
            Person buyer = peopleMap.get(personName);
            Product product = productMap.get(productName);
            try {
                buyer.buyProduct(product);
                System.out.printf("%s bought %s%n",personName,productName);
            }catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
            }
            command = scanner.nextLine();
        }
        peopleMap.values().forEach(System.out::println);
    }
}
