package Java_OOP._09PolymorphismLab.jo03Animals;

public abstract class Animal {
    private String name;
    private String favouriteFood;

    protected Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    public String getName() {
        return name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public String explainSelf(){
        return String.format("I am %s and my Favourute food is %s",
                this.getName(),
                this.getFavouriteFood());
    }
}
