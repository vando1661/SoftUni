package _14Generics_Exercises.JA04GenericSwapMethodInteger;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

    private List<T> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        values.add(element);
    }

    public void swap(int firstIdex, int secondIndex) {
        T temp = values.get(firstIdex);
        values.set(firstIdex, values.get(secondIndex));
        values.set(secondIndex, temp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T value : values) {
            sb.append(String.format("%s: %s%n", value.getClass().getName(), value));
        }
        return sb.toString();
    }
}
