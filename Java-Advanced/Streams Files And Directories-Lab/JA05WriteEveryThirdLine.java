package _7StreamsFilesAndDirectoriesLab;


import java.io.*;

public class JA05WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        String path = "resources/input.txt";
        String outPath = "resources/05.WriteEveryThirdLineOutput.txt";
        BufferedReader in = new BufferedReader(new FileReader(path));
        BufferedWriter out = new BufferedWriter(new FileWriter(outPath));
        String line = in.readLine();
        int lineCounter = 1;
        while (line != null) {
            lineCounter++;
            line = in.readLine();
            if (lineCounter % 3 == 0) {
                out.write(line);
                out.newLine();
            }
        }
        out.close();

    }
}
