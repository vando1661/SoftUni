package textProcessingExercise;

import java.util.Scanner;

public class JF03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String path = scanner.nextLine();
        String [] foldersName = path.split("\\\\");
        String fullFileName = foldersName[foldersName.length-1];
        String filmName = fullFileName.split("\\.")[0];
        String extension = fullFileName.split("\\.")[1];
        System.out.println("File name: " + filmName);
        System.out.println("File extension: " + extension);

    }
}
