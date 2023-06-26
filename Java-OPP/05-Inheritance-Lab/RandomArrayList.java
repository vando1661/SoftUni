package Java_OOP._05InheritanceLab;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArrayList<T> extends ArrayList<T> {
    public T getRandomElement() {
        int index = ThreadLocalRandom.current().nextInt(0, size());
        return get(index);
    }
}
