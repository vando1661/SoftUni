package _12DefiningClassesExercises.JA03SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostForOneKm;
    private int travelDistance;

    public Car(String model, double fuelAmount, double fuelCostForOneKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostForOneKm = fuelCostForOneKm;
        this.travelDistance = 0;
    }
    public double calculateFuel(int distance){
        return  this.getFuelCostForOneKm() * distance;
    }
    public  boolean hasEnoughFuel(int distance){
        return  fuelAmount >= calculateFuel(distance);
    }
    public void drive(int distance){
        if(hasEnoughFuel(distance)){
            this.fuelAmount -= calculateFuel(distance);
            this.travelDistance += distance;
        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelCostForOneKm() {
        return fuelCostForOneKm;
    }

    public void setFuelCostForOneKm(double fuelCostForOneKm) {
        this.fuelCostForOneKm = fuelCostForOneKm;
    }
    public int getTravelDistance(){
        return travelDistance;
    }
    public void setTravelDistance(int travelDistance){
        this.travelDistance =travelDistance;
    }
    @Override
    public String toString() {
        return String.format("%s %.2f %d", model, fuelAmount, travelDistance);
    }

}
