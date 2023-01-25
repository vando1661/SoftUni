package _11DefiningClassesLab.JA01CarInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String [] dateCar = scanner.nextLine().split(" ");
            Car car = new Car();
            String carName = dateCar[0];
            String carModel = dateCar[1];
            int carHP = Integer.parseInt(dateCar[2]);
            car.setBrand(carName);
            car.setModel(carModel);
            car.setHorsePower(carHP);
            cars.add(car);
        }
        for (Car car : cars) {
            System.out.println(car.getInfo());

        }
    }
}
