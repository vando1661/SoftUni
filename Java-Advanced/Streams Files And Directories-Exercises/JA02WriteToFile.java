package _8StreamsFilesAndDirectories_Exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JA02WriteToFile {
    public static void main(String[] args) {
        String path = "resources/Java-Advanced-Files-and-Streams/input.txt";
        try {
            BufferedReader bfr = new BufferedReader(new FileReader(path));

            long sum = 0;
            String line = bfr.readLine();
            while (line != null) {
                char[] charactersLine = line.toCharArray();
                for (char character:charactersLine) {
                    sum+= character;
                }

                line = bfr.readLine();

            }
            System.out.println(sum);
            bfr.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
