package _8StreamsFilesAndDirectories_Exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JA01SumLines {
    public static void main(String[] args) throws IOException {
        String path = "resources/Java-Advanced-Files-and-Streams/input.txt";
        try {BufferedReader bfr = new BufferedReader(new FileReader(path));

            String line = bfr.readLine();
            while (line != null) {
                long sum = 0;
                char[] charactersLine = line.toCharArray();
                for (char character:charactersLine) {
                    sum+= character;
                }

                System.out.println(sum);
                line = bfr.readLine();

            }
            bfr.close();

        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
