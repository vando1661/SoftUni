package _12DefiningClassesExercises.JA05CarSalesman;

public class Engine {
    private String engineModel;
    private int enginePower;
    private String displacement;
    private String efficiency;

    public Engine(String engineModel, int enginePower,String displacement, String efficiency) {
        this.engineModel = engineModel;
        this.enginePower = enginePower;
        this.displacement = displacement;
        this.efficiency = efficiency;

    }public Engine(String engineModel, int enginePower){
        this(engineModel,enginePower,"n/a","n/a");

    }
    public Engine(String engineModel, int enginePower,String displacement){
        this(engineModel,enginePower,displacement,"n/a");
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(engineModel).append(":").append("\n")
                .append("Power: ").append(enginePower).append("\n")
                .append("Displacement: ").append(displacement).append("\n")
                .append("Efficiency: ").append(efficiency);
        return stringBuilder.toString();
    }

}
