package exam.Final;

import java.util.*;

public class JF0303NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> carMap = new LinkedHashMap<>();
        for (int i = 1; i <=n; i++) {
            String [] text = scanner.nextLine().split("\\|");
            String carModel = text[0];
            int mileage = Integer.parseInt(text[1]);
            int fuel = Integer.parseInt(text[2]);
            List<Integer> carList = new ArrayList<>();
            carList.add(mileage);
            carList.add(fuel);
            carMap.put(carModel,carList);
        }
        String input = scanner.nextLine();
        while (!input.equals("Stop")){
            String [] array = input.split(" : ");
            String command = array[0];
            String currentCar = "";
            int currentFuel = 0;
            int currentDistance = 0;
            int fuel = 0;
            int distance = 0;
            if(command.equals("Drive")) {
                //"Drive : {car} : {distance} : {fuel}":
                currentCar = array[1];
                currentDistance = Integer.parseInt(array[2]);
                currentFuel = Integer.parseInt(array[3]);
                fuel = carMap.get(currentCar).get(1);
                distance = carMap.get(currentCar).get(0);
                if(fuel > currentFuel){
                    List<Integer> newList = new ArrayList<>();
                    newList.add(distance + currentDistance);
                    newList.add(fuel - currentFuel);
                    carMap.put(currentCar,newList);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",currentCar,currentDistance,currentFuel);
                } else {
                    System.out.println("Not enough fuel to make that ride");
                }if(carMap.get(currentCar).get(0) >= 100000){
                    carMap.remove(currentCar);
                    System.out.printf("Time to sell the %s!%n",currentCar);
                }
            }else if(command.equals("Refuel")){
                //"Refuel : {car} : {fuel}":
                currentCar = array[1];
                currentFuel = Integer.parseInt(array[2]);
                fuel = carMap.get(currentCar).get(1);
                fuel = fuel + currentFuel;
                if(fuel > 75){
                    int dif = currentFuel-(fuel - 75);
                    fuel = 75;
                    List<Integer> newList = new ArrayList<>();
                    distance = carMap.get(currentCar).get(0);
                    newList.add(distance);
                    newList.add(fuel);
                    carMap.put(currentCar,newList);

                    System.out.printf("%s refueled with %d liters%n",currentCar,dif);
                }else {
                    List<Integer> newList = new ArrayList<>();
                    distance = carMap.get(currentCar).get(0);
                    newList.add(distance);
                    newList.add(fuel);
                    carMap.put(currentCar,newList);
                    System.out.printf("%s refueled with %d liters%n",currentCar,currentFuel);
                }
            }else if(command.equals("Revert")) {
                //"Revert : {car} : {kilometers}":
                currentCar = array[1];
                currentDistance = Integer.parseInt(array[2]);
                distance = carMap.get(currentCar).get(0);
                distance = distance - currentDistance;
                fuel = carMap.get(currentCar).get(1);
                List<Integer> newL = new ArrayList<>();
                newL.add(distance);
                newL.add(fuel);
                carMap.put(currentCar,newL);
                if(distance > 10000){
                    System.out.printf("%s mileage decreased by %d kilometers%n",currentCar,currentDistance);
                }
                if(distance < 10000){
                    List<Integer> newList = new ArrayList<>();
                    distance = 10000;
                    fuel = carMap.get(currentCar).get(1);
                    newList.add(distance);
                    newList.add(fuel);
                    carMap.put(currentCar,newList);

                }
            }


            input = scanner.nextLine();
        }
        carMap.entrySet()
                .forEach(entry -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1)));


    }
}
