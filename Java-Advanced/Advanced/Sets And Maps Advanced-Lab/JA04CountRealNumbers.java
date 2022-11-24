package _5SetsAndMapsAdvanced_Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class JA04CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double [] values = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();
        LinkedHashMap<Double, Integer>  digitsMap = new LinkedHashMap<>();
        for (double value:values) {
            if(!digitsMap.containsKey(value)){
                digitsMap.put(value,1);
            }else {
                digitsMap.put(value ,digitsMap.get(value) + 1);
            }
        }
        for (Double key : digitsMap.keySet()) {
            System.out.println(String.format("%.1f -> %d",key,digitsMap.get(key)));
        }
    }
}
