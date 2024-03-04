package Java_Advance._7StreamsFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class JA03CopyBytes {
    public static void main(String[] args) throws IOException {
        String path = "resources/input.txt";
        FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream("resources/03.CopyBytesOutput.txt");
        int bytes = fileInputStream.read();
        while (bytes != -1) {
            if (bytes != 10 && bytes != 32) {
                String digits = String.valueOf(bytes);
                for (int i = 0; i < digits.length(); i++) {
                    fileOutputStream.write(digits.charAt(i));
                }
            } else {
                fileOutputStream.write((char) bytes);
            }
            bytes = fileInputStream.read();
        }
        fileInputStream.close();
        fileOutputStream.close();

    }
}
