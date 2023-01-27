package Java_Advance._13GenericsLab.JA02GenericArrayCreator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator {
    public  static <T> T[] create(int length, T defaultValue){

        return create(defaultValue.getClass(),length,defaultValue);
    }
    public static <Type> Type [] create(Class <?> clazz,int length, Type defaultValue){

        Type[] arr = (Type[]) Array.newInstance(clazz,length);
        Arrays.fill(arr,defaultValue);

        return arr;
    }

    public static class Main {
        public static void main(String[] args) {


            Integer [] arr = create(Integer.class,5, 13);
            String[] strings = create(5,"Java");
            for (int i : arr) {
                System.out.print(i + " ");
            }
            for (String s: strings) {
                System.out.print(s + " ");
            }

        }
    }
}
