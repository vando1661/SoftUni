package _7StreamsFilesAndDirectoriesLab;

import java.io.File;
import java.util.ArrayDeque;

public class JA08NestedFolders {
    public static void main(String[] args) {

        File root = new File("resources/Files-and-Streams");

        ArrayDeque<File> queue = new ArrayDeque<>();
        queue.offer(root);
        int count = 0;


        while (!queue.isEmpty()) {
            File file = queue.poll();
            File[] filesList = file.listFiles();


            if (filesList != null) {
                for (File f : filesList) {
                    if (f.isDirectory()){
                        queue.offer(f);
                    }
                }
                System.out.println(file.getName());
                count++;
            }
        }
        System.out.println(count + " folders");

    }
}



