package Java_OOP._10PolymorphismExercises.jo02VehiclesExtension;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();

        vehicleMap.put("Car", getVehicle(scanner));
        vehicleMap.put("Truck", getVehicle(scanner));
        vehicleMap.put("Bus",getVehicle(scanner));

        int numLine = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numLine; i++) {
            String[] commandDate = scanner.nextLine().split("\\s+");
            String command = commandDate[0];
            String typeVehicle = commandDate[1];
            double argument = Double.parseDouble(commandDate[2]);
            switch (command) {
                case "DriveEmpty":
                    System.out.println(vehicleMap.get(typeVehicle).vehicleDrive(argument));
                    break;
                case "Drive":
                    System.out.println(vehicleMap.get(typeVehicle).driveWithAC(argument));
                    break;
                case "Refuel":
                    try {
                        vehicleMap.get(typeVehicle).vehicleRefueling(argument);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
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
        double tankCapacity = Double.parseDouble(vehicleData[3]);

        switch (vehicleType) {
            case "Car":
                return new Car(fuelQuantity, fuelConsumption,tankCapacity);
            case "Truck":
                return new Truck(fuelQuantity, fuelConsumption,tankCapacity);
            case "Bus":
                return new Bus(fuelQuantity,fuelConsumption,tankCapacity);
            default:
                throw new IllegalArgumentException("Missing car!");
        }
    }
}
