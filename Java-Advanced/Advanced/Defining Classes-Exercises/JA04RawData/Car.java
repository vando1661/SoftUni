package _12DefiningClassesExercises.JA04RawData;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private static int TIRES_COUNT = 4;
    private Tires[] tires = new Tires[TIRES_COUNT];

    public Car(String[] dataCar) {
        int count = -1;
        this.model = dataCar[++count];
        this.engine = new Engine(
                Integer.parseInt(dataCar[++count]),
                Integer.parseInt(dataCar[++count])
        );
        this.cargo = new Cargo(
                Integer.parseInt(dataCar[++count]),
                (dataCar[++count])
        );
        for (int i = 0; i < TIRES_COUNT; i++) {
            this.tires[i] = new Tires(Double.parseDouble(dataCar[++count]),
                    Integer.parseInt(dataCar[++count]));

        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Tires[] getTires() {
        return tires;
    }

    public void setTires(Tires[] tires) {
        this.tires = tires;
    }

    public String toString() {
        return this.model;
    }
}
