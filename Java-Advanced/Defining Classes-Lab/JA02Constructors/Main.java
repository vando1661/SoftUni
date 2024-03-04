package _11DefiningClassesLab.JA02Constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String [] date = scanner.nextLine().split(" ");
            Car car = new Car();
            String carName = date[0];
            if(date.length < 3){
                car.setBrand(carName);
            }else {
                String carModel = date[1];
                int carHP = Integer.parseInt(date[2]);
                car.setBrand(carName);
                car.setModel(carModel);
                car.setHp(carHP);
            }
            cars.add(car);
        }
        for (Car car: cars) {
            System.out.println(car.getPrint());
        }
    }
}
