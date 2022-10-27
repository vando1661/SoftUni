package mapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class JF05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Map<String ,String> mapCarParking = new LinkedHashMap<>();
        for (int i = 1; i <=num ; i++) {
            String text = scanner.nextLine();
            String command = text.split(" ")[0];
            String name = text.split(" ")[1];
            if(command.equals("register")){
                String regNumber = text.split(" ")[2];
                if(!mapCarParking.containsKey(name)){
                    mapCarParking.put(name,regNumber);
                    System.out.println(name + " registered " + regNumber + " successfully");
                }else {
                    System.out.println("ERROR: already registered with plate number "+regNumber);
                }
            }else if(command.equals("unregister")){
                if(!mapCarParking.containsKey(name)){
                    System.out.println("ERROR: user "+ name + " not found");
                }
                else{
                    mapCarParking.remove(name);
                    System.out.println(name + " unregistered successfully");
                }
            }
        } mapCarParking.forEach((key, value) -> System.out.println(key + " => " + value));

    }
}
