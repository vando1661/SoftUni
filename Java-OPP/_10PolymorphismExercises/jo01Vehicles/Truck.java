package Java_OOP._10PolymorphismExercises.jo01Vehicles;

public class Truck extends Vehicle {
    public final static double AC_ADDITIONAL_CONSUMPTION = 1.6;
    public final static double FUEL_AFTER_DRIVER_DEDUCTION = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + AC_ADDITIONAL_CONSUMPTION);
    }

    @Override
    public void vehicleRefueling(double liters) {
      super.vehicleRefueling(liters * FUEL_AFTER_DRIVER_DEDUCTION);
    }


}
