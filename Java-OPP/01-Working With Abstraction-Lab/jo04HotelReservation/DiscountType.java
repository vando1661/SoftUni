package _01WorkingWithAbstraction_Lab.jo04HotelReservation;

public enum DiscountType {
    NONE("None",1),
    SECONDVISIT("SecondVisit",0.9),
    VIP("VIP",0.8);

    private  String name;
    private double percent;

    DiscountType(String name, double percent) {
        this.name = name;
        this.percent = percent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}