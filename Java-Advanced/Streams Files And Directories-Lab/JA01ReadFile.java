package Java_Advance._7StreamsFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.IOException;


public class JA01ReadFile {
    public static void main(String[] args) throws IOException {
        String path = "resources/input.txt";
        FileInputStream fileStream = new FileInputStream(path);
        int oneByte = fileStream.read();
        while (oneByte >=0){
            System.out.print(Integer.toBinaryString(oneByte) + " ");
            oneByte = fileStream.read();
        }


    }
}
