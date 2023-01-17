package _8StreamsFilesAndDirectories_Exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class JA07MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        Path pathOne = Paths.get("resources/Java-Advanced-Files-and-Streams/inputOne.txt");
        List<String> first = Files.readAllLines(pathOne);
        Path pathTwo = Paths.get("resources/Java-Advanced-Files-and-Streams/inputTwo.txt");
        List<String> second = Files.readAllLines(pathTwo);
        Path result = Paths.get("resources/Java-Advanced-Files-and-Streams/results.txt");
        Files.write(result , first, StandardOpenOption.APPEND);
        Files.write(result , second, StandardOpenOption.APPEND);

    }
}
