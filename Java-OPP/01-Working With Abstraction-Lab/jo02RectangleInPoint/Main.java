package _01WorkingWithAbstraction_Lab.jo02RectangleInPoint;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] coordinates = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int bottomLeftX = coordinates[0];
        int bottomLefY = coordinates[1];
        int topRightX = coordinates[2];
        int topRightY = coordinates[3];
        Point bottomLef = new Point(bottomLeftX,bottomLefY);
        Point topRight = new Point(topRightX,topRightY);
        Rectangle rectangle = new Rectangle(bottomLef,topRight);
        
        int countPoints = Integer.parseInt(scanner.nextLine());
        for (int point = 0; point < countPoints ; point++) {
            int [] checkPoint = Arrays.stream(scanner.nextLine().split("\\s+"))
                            .mapToInt(Integer::parseInt)
                            .toArray();
            int x = checkPoint[0];
            int y = checkPoint[1];
            Point searchedPoint = new Point(x,y);
            System.out.println(rectangle.contains(searchedPoint));
        }
    }
}
