package _7StreamsFilesAndDirectoriesLab;

import java.io.*;

class Cube implements Serializable{
     String color;
     double width;
     double height;
     double depth;
}

public class JA09SerializeCustomObject {
    public static void main(String[] args) throws IOException {
        Cube cube = new Cube();
        cube.color ="green";
        cube.width = 15.3d;
        cube.height = 12.4d;
        cube.depth = 3d;

        String path = "resources/save.txt";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))){
                oos.writeObject(cube);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
