package Java_OOP._01WorkingWithAbstraction_Lab.jo04HotelReservation;

public enum Seasons {
    AUTUMN("autumn",1),
    SPRING("spring",2),
    WINTER("winter",3),
    SUMMER("summer",4);
    private String name;
    private int coefficient;

    Seasons(String name, int multiplyCoefficient) {
        this.name = name;
        this.coefficient = multiplyCoefficient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }
}
