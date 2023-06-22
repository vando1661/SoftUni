package Java_OOP._01WorkingWithAbstraction_Lab.jo04HotelReservation;

public class PriceCalculator {
    public static  double calculatePrice(double pricePerDay,int days,Seasons seasons, DiscountType discountType){

        double allDays = days * pricePerDay;
        double seasonPrice = allDays * seasons.getCoefficient();
        double finalSum = seasonPrice * discountType.getPercent();
        return finalSum;
    }
}
