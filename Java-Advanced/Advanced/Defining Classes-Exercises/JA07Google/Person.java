package _12DefiningClassesExercises.JA07Google;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private Company company;
    private List<Pokemon> pokemons;
    private List<Parents> parents;
    private List<Children> children;
    public Person(){
        this.pokemons = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void setCompany(Company company) {
        this.company = company;

    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public List<Parents> getParents() {
        return parents;
    }

    public List<Children> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Company: ").append("\n");
        if (company != null) {
            sb.append(company.toString()).append("\n");
        }
        sb.append("Java_OOP._06InheritanceExercises.jo04NeedForSpeed.Java_OOP._07InterfacesАndAbstractionLab.jo01CarShop.Java_OOP._07InterfacesAndAbstractionLab.jo06Ferrari.Car: ").append("\n");
        if(car != null){
            sb.append(car.toString()).append("\n");
        }

        sb.append("Pokemon: ").append("\n");
        for (Pokemon pokemon:pokemons) {
            sb.append(pokemon.toString()).append("\n");
        }

        sb.append("Parents: ").append("\n");
        for (Parents parent: parents) {
            sb.append(parent.toString()).append("\n");
        }
        sb.append("Children: ").append("\n");
        for (Children child : children) {
            sb.append(child.toString()).append("\n");
        }
        return sb.toString();
    }
}
