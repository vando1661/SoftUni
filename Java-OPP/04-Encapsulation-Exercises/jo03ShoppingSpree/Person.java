package Java_OOP._04EncapsulationExercises.jo03ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        products = new ArrayList<>();
    }
    public  void buyProduct(Product product){
        if(money< product.getCost()){
            throw new IllegalArgumentException(String.format("%s can't afford %s",name,product.getName()));
        }
        products.add(product);
        money-= product.getCost();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if(money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + " - ");
        sb.append(products.stream().map(Product::getName).collect(Collectors.joining(", ")));
        return sb.toString();
    }
}
