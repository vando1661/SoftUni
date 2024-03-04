package Java_Advance._13GenericsLab.JA02GenericArrayCreator;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = ArrayCreator.create(Integer.class, 5, 13);
        String[] strings = ArrayCreator.create(5, "Java");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        for (String s : strings) {
            System.out.print(s + " ");
        }

    }
}

