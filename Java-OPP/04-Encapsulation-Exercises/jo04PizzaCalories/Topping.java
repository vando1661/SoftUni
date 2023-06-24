package Java_OOP._04EncapsulationExercises.jo04PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        switch (toppingType) {
            case "Meat":
            case "Veggies":
            case "Cheese":
            case "Sauce":
                this.toppingType = toppingType;
                break;
            default:
                String errorMessage = String.format("Cannot place %s on top of your pizza.",toppingType);
                throw new IllegalArgumentException(errorMessage);
        }
    }

    private void setWeight(double weight) {
        if(weight < 1 || weight > 50){
            String errorMessage = String.format("%s weight should be in the range [1..50].",toppingType);
            throw new IllegalArgumentException(errorMessage);
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return 2 * weight * getModifiers();
    }
    private double getModifiers(){
        switch (toppingType){
            case "Meat":
                return 1.2;
            case "Veggies":
                return 0.8;
            case "Cheese":
                return 1.1;
            case "Sauce":
                return 0.9;
            default:
                return 0;
        }
    }
}
