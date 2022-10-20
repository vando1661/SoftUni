package arraysExercise;

import java.util.Scanner;

public class JF03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int nRow = Integer.parseInt(scanner.nextLine());
        String [] firstArr = new String[nRow];
        String [] secondArr = new String[nRow];
        for (int row = 0 ; row < nRow; row++){
        String num = scanner.nextLine();
            String [] rowArr = num.split(" ");
            if(row % 2 != 0){
                firstArr[row] = rowArr[1];
                secondArr[row] = rowArr[0];
            }else {
                firstArr[row] = rowArr[0];
                secondArr[row] = rowArr[1];
            }

        }

        System.out.println(String.join(" ",firstArr));
        System.out.println(String.join(" ",secondArr));
    }
}
