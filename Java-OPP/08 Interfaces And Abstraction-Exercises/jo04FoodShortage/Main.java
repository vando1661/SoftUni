package Java_OOP._08InterfacesAndAbstractionExercises.jo04FoodShortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Map<String, Buyer> buyerMap = new HashMap<>();
        for (int i = 0; i < num ; i++) {
            String [] data = scanner.nextLine().split("\\s+");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            Buyer buyer;
            if(data.length == 4){
                String id = data[2];
                String birthDate = data[3];
                buyer = new Citizen(name,age,id,birthDate);

            }else {
                String group = data[2];
                buyer = new Rebel(name,age,group);

            }
            buyerMap.put(name,buyer);
        }
        String nameLine = scanner.nextLine();
        while (!"End".equals(nameLine)){
            Buyer buyer = buyerMap.get(nameLine);
            if(buyer != null){
                buyer.buyFood();
            }
            nameLine = scanner.nextLine();
        }
        int totalSum = buyerMap.values()
                .stream()
                .mapToInt(Buyer::getFood)
                .sum();
        System.out.println(totalSum);
    }
}
