package _7StreamsFilesAndDirectoriesLab;

import java.io.*;
import java.util.Scanner;

public class JA04ExtractIntegers {
    public static void main(String[] args) throws IOException {
        String path = "resources/input.txt";
        FileReader FileReader = new FileReader(path);
        PrintWriter writer = new PrintWriter(new FileOutputStream("resources/04.ExtractIntegersOutput.txt"));
        Scanner scanner = new Scanner(FileReader);
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                writer.println((scanner.nextInt()));

            } else {
                scanner.next();
            }
        }
        writer.close();
    }
}
