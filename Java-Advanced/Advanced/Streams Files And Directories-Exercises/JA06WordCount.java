package _8StreamsFilesAndDirectories_Exercises;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class JA06WordCount {
    public static void main(String[] args) throws IOException {
        String pathWords = "resources/Java-Advanced-Files-and-Streams/words.txt";
        String pathIn = "resources/Java-Advanced-Files-and-Streams/text.txt";
        String pathOut = "resources/Java-Advanced-Files-and-Streams/results.txt";
        Scanner wordsScanner = new Scanner(new FileReader(pathWords));
        String [] wordSearch = wordsScanner.nextLine().split(" ");
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        for (String w: wordSearch) {
            map.put(w,0);
        }
        Scanner fileScanner = new Scanner(new FileReader(pathIn));
        String singleWord = fileScanner.next();
        while (fileScanner.hasNext()){
            if(map.containsKey(singleWord)){
                int count = map.get(singleWord);
                count++;
                map.put(singleWord,count);

            }
            singleWord = fileScanner.next();
        }
        PrintWriter pw = new PrintWriter(new FileWriter(pathOut));
        map.entrySet()
                .stream()
                .sorted((f,s) -> s.getValue() - f.getValue())
                .forEach(entry -> pw.printf("%s - %d%n",entry.getKey(),entry.getValue()));
        wordsScanner.close();
        fileScanner.close();
        pw.close();
    }
}
