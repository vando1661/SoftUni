package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class JF09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
     int numArr [] = Arrays
             .stream(scanner.nextLine().split(" "))
             .mapToInt(Integer::parseInt)
             .toArray();
       //swap размяна на двата индекс.
       //multiply  * на двата индекса.
        //decrease намаляване.


            String commands = scanner.nextLine();
            boolean isEnd = false;
            while (!commands.equals("end")){
                isEnd = true;
                String [] commandsParts = commands.split(" ");
                String commandsTape = commandsParts[0];
                switch (commandsTape){
                    case "swap":
                        int indexOne = Integer.parseInt(commandsParts[1]);
                        int elementOne = numArr[indexOne];
                        int indexTwo = Integer.parseInt(commandsParts[2]);
                        int elementTwo = numArr[indexTwo];
                        numArr[indexOne] = elementTwo;
                        numArr[indexTwo] = elementOne;
                        break;
                    case "multiply":
                        int multiplyIndexOne = Integer.parseInt(commandsParts[1]);
                        int multiplyElementOne = numArr[multiplyIndexOne];
                        int multiplyIndexTwo = Integer.parseInt(commandsParts[2]);
                        int multiplyElementTwo = numArr[multiplyIndexTwo];
                        numArr[multiplyIndexOne] = multiplyElementOne * multiplyElementTwo;
                        break;
                    case "decrease":
                        for (int i = 0; i <= numArr.length - 1 ; i++) {
                            numArr[i]= numArr[i] - 1;
                        }
                        break;
                }

                commands = scanner.nextLine();
            }
        for (int i = 0; i <=numArr.length - 1; i++) {
            if (i != numArr.length - 1){
                System.out.print(numArr[i] + ", ");
            }else {
                System.out.print(numArr[i]);
            }
        }



    }
}
