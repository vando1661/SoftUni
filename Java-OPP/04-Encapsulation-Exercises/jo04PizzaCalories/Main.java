package Java_OOP._04EncapsulationExercises.jo04PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] pizzaInfo = scanner.nextLine().split(" ");
        String pizzaName = pizzaInfo[1];
        int numberOfToppings = Integer.parseInt(pizzaInfo[2]);
        String [] doughDate = scanner.nextLine().split(" ");
        String flourType = doughDate[1];
        String bakingTechnique = doughDate[2];
        double wight = Double.parseDouble(doughDate[3]);
        try {
            Pizza pizza = new Pizza(pizzaName,numberOfToppings);
            Dough dough = new Dough(flourType,bakingTechnique,wight);
            pizza.setDough(dough);
            String command = scanner.nextLine();
            while (!"END".equals(command)){
                String [] toppingInfo = command.split(" ");
                String name = toppingInfo[1];
                double toppingWight = Double.parseDouble(toppingInfo[2]);
                Topping topping = new Topping(name,toppingWight);
                pizza.addTopping(topping);
                command = scanner.nextLine();
            }
            System.out.printf("%s - %.2f",pizza.getName(),pizza.getOverallCalories());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

}
