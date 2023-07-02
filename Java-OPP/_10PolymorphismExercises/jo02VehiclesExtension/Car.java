package Java_OOP._10PolymorphismExercises.jo02VehiclesExtension;

public class Car extends Vehicle {
    public final static double AC_ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption,double tankCapacity) {
        super(fuelQuantity, fuelConsumption,tankCapacity,AC_ADDITIONAL_CONSUMPTION);
    }

}
