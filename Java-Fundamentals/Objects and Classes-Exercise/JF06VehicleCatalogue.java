package objectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JF06VehicleCatalogue {
    static class Catalogue{
        private String type;
        private String model;
        private String color;
        private double hp;
    public Catalogue(String type, String model, String color, double hp) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.hp = hp;
    }

        public String getModel() {
            return this.model;
        }
        public String getType(){
            return this.type;
        }
        public double getHp(){
        return this.hp;
        }

        @Override
        public String toString(){
        String formattedType ="";
        if(this.type.equals("car")){
            formattedType = "Car";
        }else if(this.type.equals("truck")){
            formattedType = "Truck";
        }
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %.0f",formattedType,this.model,this.color,this.hp);
    }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String text = scanner.nextLine();
        List<Catalogue> catalogueList = new ArrayList<>();
        while (!text.equals("End")){
            String typeOfVehicle = text.split(" ")[0];
            String modelOfVehicle = text.split(" ")[1];
            String colorOfVehicle = text.split(" ")[2];
            double hpOfVehicle = Double.parseDouble(text.split(" ")[3]);
            Catalogue catalogue = new Catalogue(typeOfVehicle,modelOfVehicle,colorOfVehicle,hpOfVehicle);
            catalogueList.add(catalogue);


            text = scanner.nextLine();
        }
        String commandModel = scanner.nextLine();
        while (!commandModel.equals("Close the Catalogue")){
            for (Catalogue catalogue:catalogueList) {
                if(commandModel.equals(catalogue.getModel())){
                    System.out.println(catalogue);
                    break;
                }
            }
            commandModel = scanner.nextLine();
        }

            System.out.printf("Cars have average horsepower of: %.2f.%n",getAverageHP(catalogueList,"car"));
            System.out.printf("Trucks have average horsepower of: %.2f.",getAverageHP(catalogueList,"truck"));
    }
    private static double getAverageHP(List<Catalogue>catalogueList,String type){
        double sum = 0;
        int count = 0;
        if(type.equals("car")){
            for (Catalogue catalogue:catalogueList) {
                if(catalogue.getType().equals("car")){
                    sum+= catalogue.getHp();
                    count++;
                }

            }
        }else  if(type.equals("truck")){
            for (Catalogue catalogue:catalogueList) {
                if(catalogue.getType().equals("truck")){
                    sum+=catalogue.getHp();
                    count++;
                }

            }
        }
        if(sum == 0){
            return 0;
        }
        return sum / count;
    }
}
