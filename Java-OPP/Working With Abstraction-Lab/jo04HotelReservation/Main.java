package _01WorkingWithAbstraction_Lab.jo04HotelReservation;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] date = scanner.nextLine().split("\\s+");
        double pricePerDay = Double.parseDouble(date[0]);
        int numberOfDays = Integer.parseInt(date[1]);
        Seasons season = Seasons.valueOf(date[2].toUpperCase(Locale.ROOT));
        DiscountType discountType = DiscountType.valueOf(date[3].toUpperCase(Locale.ROOT));
        double holidayPrice = PriceCalculator.calculatePrice(pricePerDay,numberOfDays,season,discountType);
        System.out.printf("%.2f",holidayPrice);
    }
}
