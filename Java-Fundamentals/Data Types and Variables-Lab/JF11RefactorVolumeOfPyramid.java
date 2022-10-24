package dataTypesAndVariablesLab;

import java.util.Scanner;

public class JF11RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        //System.out.println("Length: ");
        double width = Double.parseDouble(scanner.nextLine());
       // System.out.println("Width: ");
        double height = Double.parseDouble(scanner.nextLine());
        //System.out.println("Height: ");
        double sum = 0;
        sum = (length * width * height) / 3;
        System.out.printf("Length: Width: Height: Pyramid Volume: %.2f", sum);
    }
}
