package textProcessingLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JF02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String [] stringArr = scanner.nextLine().split(" ");
        List<String> repeatList = new ArrayList<>();
        for (int i = 0; i <stringArr.length; i++) {
            String currentWord = stringArr[i];
            int len = currentWord.length();
            String repeatWord = repeatStr(currentWord,len);
            repeatList.add(repeatWord);

        }
        System.out.println(String.join("",repeatList));

    }
    public static String repeatStr(String s , int count){
        String result ="";
        for (int i = 0; i < count; i++) {
            result += s;

        }
        return result;
    }
}
