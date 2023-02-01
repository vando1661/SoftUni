package _14Generics_Exercises.JA05GenericCountMethodString;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> values;
    public Box(){
        this.values = new ArrayList<>();
    }

    public List<T> getValues() {
        return values;
    }
    public void  add(T element){
        values.add(element);
    }

    public void setValues(List<T> values) {
        this.values = values;
    }
    public int countOgGreater(T elementToCompareTo){
return (int) values.stream()
        .filter(elementBox -> elementBox.compareTo(elementToCompareTo)> 0)
        .count();
    }

}
