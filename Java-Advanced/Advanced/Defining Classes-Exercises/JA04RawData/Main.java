package _12DefiningClassesExercises.JA04RawData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            //String [] dateCar = scanner.nextLine().split("\\s+");
            Car car = new Car(scanner.nextLine().split("\\s+"));
            cars.add(car);

        }
        switch (scanner.nextLine()) {
            case "fragile":
                cars.stream()
                        .filter(c -> c.getCargo().getCargoType().equals("fragile")
                                && Arrays.stream(c.getTires()).anyMatch(t -> t.getTiersPressure() < 1))
                        .forEach(System.out::println);
                break;
            case "flamable":
                cars.stream()
                        .filter(c -> c.getCargo().getCargoType().equals("flamable")
                                && c.getEngine().getEnginePower() > 250)
                        .forEach(System.out::println);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + scanner.nextLine());
        }
    }
}
