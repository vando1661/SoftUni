package Java_Advance._6SetsAndMapsAdvancedExercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class JA04CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<Character, Integer> mapChar = new TreeMap();
        int charCounter = 1;
        for (int index = 0; index < text.length(); index++) {
            char currentChar = text.charAt(index);
            if(mapChar.containsKey(currentChar)){
                int currentValue = mapChar.get(currentChar).intValue();
                mapChar.put(currentChar,currentValue+charCounter);
            }else {
                mapChar.put(currentChar,charCounter);

            }
        }
        for (Character key : mapChar.keySet()) {
            System.out.println(String.format("%c: %d time/s",key,mapChar.get(key)));
        }
    }
}
