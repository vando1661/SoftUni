package _12DefiningClassesExercises.JA03SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Map<String, Car> carsMap = new LinkedHashMap<>();
        for (int i = 0; i < num; i++) {
            String[] carDate = scanner.nextLine().split(" ");
            String model = carDate[0];
            double fuelAmount = Double.parseDouble(carDate[1]);
            double fuelCostForOneKm = Double.parseDouble(carDate[2]);
            Car car = new Car(model, fuelAmount, fuelCostForOneKm);
            carsMap.put(model, car);
        }
        String commandDate = scanner.nextLine();
        while (!commandDate.equals("End")) {
            String[] command = commandDate.split("\\s+");

            String modelCar = command[1];
            int distance = Integer.parseInt(command[2]);

            Car carToDrive = carsMap.get(modelCar);
            carToDrive.drive(distance);
            commandDate = scanner.nextLine();
        }
       carsMap.values().forEach(System.out::println);

    }
}
