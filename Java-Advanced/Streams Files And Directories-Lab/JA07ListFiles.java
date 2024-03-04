package _7StreamsFilesAndDirectoriesLab;

import java.io.File;

public class JA07ListFiles {
    public static void main(String[] args) {
        String address = "resources/Files-and-Streams";
        File file = new File(address);
        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (!f.isDirectory()) {
                        System.out.printf("%s: [%s]%n", f.getName(), f.length());
                    }
                }
            }
        }
    }
}
