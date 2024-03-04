package _12DefiningClassesExercises.JA04RawData;

public class Tires {
    private double tiersPressure;
    private int tiersAge;

    public Tires(double tiersPressure, int tiersAge) {
        this.tiersPressure = tiersPressure;
        this.tiersAge = tiersAge;
    }

    public double getTiersPressure() {
        return tiersPressure;
    }

    public void setTiersPressure(double tiersPressure) {
        this.tiersPressure = tiersPressure;
    }

    public int getTiersAge() {
        return tiersAge;
    }

    public void setTiersAge(int tiersAge) {
        this.tiersAge = tiersAge;
    }
}
