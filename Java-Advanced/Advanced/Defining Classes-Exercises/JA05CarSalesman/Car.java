package _12DefiningClassesExercises.JA05CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private String weight;
    private String color;

    public Car(String model, Engine engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;

    }

    public Car(String model, Engine engine) {
        this(model, engine, "n/a", "n/a");
    }

    public Car(String model, Engine engine, String weight) {
        this(model, engine, weight, "n/a");
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(model).append(":").append("\n")
                .append(engine.toString()).append("\n")
                .append("Weight: ").append(weight).append("\n")
                .append("Color: ").append(color);

        return stringBuilder.toString();
    }
}