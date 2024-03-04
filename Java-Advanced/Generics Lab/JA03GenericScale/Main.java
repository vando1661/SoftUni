package Java_Advance._13GenericsLab.JA03GenericScale;

public class Main {
    public static void main(String[] args) {
        Integer left = 12;
        Integer right = 25;
        int i = left.compareTo(right);
        Scale<Integer> stringScale = new Scale<>(left, right);
        System.out.println(stringScale.getHeavier());
    }
}
