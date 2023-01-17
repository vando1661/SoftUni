package _8StreamsFilesAndDirectories_Exercises;

import java.io.*;
import java.util.Locale;

public class JA03AllCapitals {
    public static void main(String[] args) throws IOException {
        String pathIn = "resources/Java-Advanced-Files-and-Streams/input.txt";
        String pathOut = "resources/Java-Advanced-Files-and-Streams/output.txt";
        BufferedReader bfr = new BufferedReader(new FileReader(pathIn));
        PrintWriter pw = new PrintWriter(pathOut);
        bfr.lines().forEach(line -> pw.println(line.toUpperCase(Locale.ROOT)));
        /*List<String> lines = new ArrayList<>();
        String line = bfr.readLine();
        while (line != null){
            lines.add(line.toUpperCase(Locale.ROOT));
            line = bfr.readLine();
        }
        for (String l:lines) {
            pw.println(l);
        }*/
        bfr.close();
        pw.close();
    }
}
