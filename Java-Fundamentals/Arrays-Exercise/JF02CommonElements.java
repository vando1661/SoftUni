package arraysExercise;

import java.util.Scanner;
public class JF02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String [] firstArr = scanner.nextLine().split(" ");
        String [] secondArr = scanner.nextLine().split(" ");
        for (int i = 0; i < secondArr.length; i++) {
            String second = secondArr[i];
            for (int j = 0; j < firstArr.length; j++) {
               String first = firstArr[j];
                if(first.equals(second)){
                    System.out.print(first + " ");
                }
            }
        }

    }
}
