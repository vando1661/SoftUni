package _7StreamsFilesAndDirectoriesLab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class JA06SortLines {
    public static void main(String[] args) throws IOException {
        String path = "resources/input.txt";
        String outPath ="resources/06.SortLinesOutput.txt";
        Path input = Paths.get(path);
        List<String> lines = Files.readAllLines(input);
        Collections.sort(lines);
        Files.write(Paths.get(outPath),lines);


    }
}
