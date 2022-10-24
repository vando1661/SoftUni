package listsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JF04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        String input = scanner.nextLine();
        int count = 0;
        while (!input.equals("End")){
            //•	Add {number} - add number at the end
            //•	Insert {number} {index} - insert number at given index
            //•	Remove {index} - remove that index
            //•	Shift left {count} - first number becomes last 'count' times
            //•	Shift right {count} - last number becomes first 'count' times
            String[]commandArray = input.split("\\s+");
            String commandName = commandArray[0];
            if(commandName.equals("Add")){
                int numAdd = Integer.parseInt(commandArray[1]);
                numList.add(numAdd);
            }else if(commandName.equals("Insert")){
                int numInsert = Integer.parseInt(commandArray[1]);
                int index = Integer.parseInt(commandArray[2]);
                if (isValidIndex(index,numList.size())){
                    numList.add(index,numInsert);
                }else {
                    System.out.println("Invalid index");
                }
            }else if(commandName.equals("Remove")){
                int indexRemove = Integer.parseInt(commandArray[1]);
                if(isValidIndex(indexRemove,numList.size())){
                    numList.remove(indexRemove);
                }else {
                    System.out.println("Invalid index");
                }
            }else if(commandName.equals("Shift")){
                String underCommand= commandArray[1];
                count = Integer.parseInt(commandArray[2]);
                 if(underCommand.equals("left")){
                      leftRotation(numList,count);
                }else if(underCommand.equals("right")){
                     rightRotation(numList,count);
                 }
            }


            input = scanner.nextLine();
        }
        for (int num:numList) {
            System.out.print(num + " ");
        }


    }
    public static void leftRotation (List<Integer> numList,int count){
      for  (int rotation = 0; rotation < count ;rotation++) {
            int firstNum = numList.get(0);
            numList.add(firstNum);
            numList.remove(0);
        }
    }
    public static void  rightRotation(List<Integer> numList,int count){
        for (int rotation = 0; rotation < count; rotation++) {
            int lastNum = numList.get(numList.size() - 1);
            numList.add(0,lastNum);
            numList.remove(numList.size() - 1);
        }
    }
    public static  boolean isValidIndex (int index,int size){
        return index >=0 && index <= size - 1;
    }
}
