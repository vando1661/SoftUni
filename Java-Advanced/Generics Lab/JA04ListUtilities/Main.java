package Java_Advance._13GenericsLab.JA04ListUtilities;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,16,22,25,29);
        System.out.println(ListUtils.getMax(numbers));
        System.out.println(ListUtils.getMin(numbers));
    }
}
