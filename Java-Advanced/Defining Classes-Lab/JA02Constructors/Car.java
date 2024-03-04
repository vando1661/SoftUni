package _11DefiningClassesLab.JA02Constructors;

public class Car {
    private String brand;
    private String model;
    private int hp;


    public Car () {
        this.brand = brand;
        this.model = "unknown";
        this.hp = -1;
    }
    public String getPrint (){
         return String .format("The car is: %s %s - %d HP."
                ,this.brand, this.model, this.hp);
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
      this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
