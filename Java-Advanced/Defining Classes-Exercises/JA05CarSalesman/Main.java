package _12DefiningClassesExercises.JA05CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEngine = Integer.parseInt(scanner.nextLine());
        Map<String, Engine> engines = new HashMap<>();
        Engine engine = null;
        for (int i = 0; i < numEngine; i++) {
            String[] dateEngine = scanner.nextLine().split("\\s+");
            String model = dateEngine[0];
            int power = Integer.parseInt(dateEngine[1]);
            if (dateEngine.length == 2) {
               engine = new Engine(model, power, "n/a", "n/a");
            } else if (dateEngine.length == 3) {
                String numOrWord = dateEngine[2];
                if (isDigits(numOrWord)) {
                    engine = new Engine(model, power, numOrWord, "n/a");
                } else {
                    engine = new Engine(model, power, "n/a", numOrWord);
                }
            } else if (dateEngine.length == 4) {
                String displacement = dateEngine[2];
                String efficiency = dateEngine[3];
                engine = new Engine(model, power, displacement, efficiency);
            }
          engines.put(model,engine);
        }
        List<Car> cars = new ArrayList<>();
        int numCar = Integer.parseInt(scanner.nextLine());
        for (int j = 0; j < numCar; j++) {
            String[] carDate = scanner.nextLine().split("\\s+");
            String model = carDate[0];
            String engineModel = carDate[1];
            Engine carEngine = engines.get(engineModel);
            Car car = null;
            if(carDate.length == 2){
                car = new Car(model,carEngine,"n/a","n/a");
            }else if(carDate.length == 3){
                String weightOrColor = carDate[2];
                if(isDigits(weightOrColor)){
                    car = new Car(model,carEngine,weightOrColor,"n/a");
                }else {
                    car = new Car(model, carEngine, "n/a", weightOrColor);
                }
            }else if(carDate.length == 4) {
                String weight = carDate[2];
                String color = carDate[3];
                car = new Car(model, carEngine, weight, color);
            }
            cars.add(car);
        }
cars.forEach(System.out::println);

    }

    private static boolean isDigits(String numOrWord) {
        return numOrWord.chars()
                .mapToObj(i -> (char) i)
                .allMatch(Character::isDigit);
    }


}
