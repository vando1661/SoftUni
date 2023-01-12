package _7StreamsFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class JA02WriteToFile {
    public static void main(String[] args) throws IOException {
        String path = "resources/input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream("resources/02.WriteToFileOutput.txt");
        int bytes = inputStream.read();
        Set<Character> punctuationTable = Set.of(',', '.', '!', '?');
        while (bytes != -1) {
            char symbol = (char) bytes;
            boolean isPunctuation = punctuationTable.contains(symbol);
            if (!isPunctuation) {
                fileOutputStream.write(symbol);
            }
            bytes = inputStream.read();

        }
    }
}
