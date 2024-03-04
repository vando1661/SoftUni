package _8StreamsFilesAndDirectories_Exercises;

import java.io.*;

public class JA05LineNumbers {
    public static void main(String[] args) throws IOException {
        String pathInput = "resources/Java-Advanced-Files-and-Streams/inputLineNumbers.txt";
        String pathOutput = "resources/Java-Advanced-Files-and-Streams/output.txt";
        BufferedReader br = new BufferedReader(new FileReader(pathInput));
        PrintWriter pw = new PrintWriter(pathOutput);
        String line = br.readLine();
        int count = 1;
        while (line != null){
            pw.println(count + ". " + line);
            count++;
            line = br.readLine();
        }
        br.close();
        pw.close();

    }
}
