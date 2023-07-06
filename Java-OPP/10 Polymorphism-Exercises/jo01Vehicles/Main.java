package Java_OOP._10PolymorphismExercises.jo01Vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();

        vehicleMap.put("Car", getVehicle(scanner));
        vehicleMap.put("Truck", getVehicle(scanner));

        int numLine = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numLine; i++) {
            String[] commandDate = scanner.nextLine().split("\\s+");
            String command = commandDate[0];
            String typeVehicle = commandDate[1];
            double argument = Double.parseDouble(commandDate[2]);
            switch (command) {
                case "Drive":
                    System.out.println(vehicleMap.get(typeVehicle).vehicleDrive(argument));
                    break;
                case "Refuel":
                    vehicleMap.get(typeVehicle).vehicleRefueling(argument);
                    break;
            }
        }
        vehicleMap.values().forEach(System.out::println);
    }

    private static Vehicle getVehicle(Scanner scanner) {
        String[] vehicleData = scanner.nextLine().split("\\s+");
        String vehicleType = vehicleData[0];
        double fuelQuantity = Double.parseDouble(vehicleData[1]);
        double fuelConsumption = Double.parseDouble(vehicleData[2]);
        switch (vehicleType) {
            case "Car":
                return new Car(fuelQuantity, fuelConsumption);
            case "Truck":
                return new Truck(fuelQuantity, fuelConsumption);
            default:
                throw new IllegalArgumentException("Missing car!");
        }
    }
}
