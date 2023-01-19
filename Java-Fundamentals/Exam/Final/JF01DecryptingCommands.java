package exam.Final;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JF01DecryptingCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String text = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Finish")){
            String [] inputArray = input.split(" ");
            String commnad = inputArray[0];
            int startIndex = 0;
            int ednIndex = 0;
            if(commnad.equals("Replace")){
                String currentChar = inputArray[1];
                String newChar = inputArray[2];
                text = text.replace(currentChar,newChar);
                System.out.println(text);

            }else if(commnad.equals("Cut")){
               startIndex = Integer.parseInt(inputArray[1]);
               ednIndex = Integer.parseInt(inputArray[2]);
                StringBuilder sb = new StringBuilder(text);
                if(startIndex <= sb.length()-1 && ednIndex <= sb.length()-1){
                    sb.delete(startIndex,ednIndex+1);
                    text = sb.toString();
                    System.out.println(text);
                }else {
                    System.out.println("Invalid indices!");
                }

            }else if(commnad.equals("Make")){
                String upperOrLower = inputArray[1];
                if(upperOrLower.equals("Upper")){
                    text = text.toUpperCase();
                }else if(upperOrLower.equals("Lower")){
                    text = text.toLowerCase();
                }
                System.out.println(text);

            }else if(commnad.equals("Check")){
                String contains = inputArray[1];
                if(text.contains(contains)){
                    System.out.println("Message contains " + contains);
                }else {
                    System.out.println("Message doesn't contain " + contains);
                }

            }else if(commnad.equals("Sum")){
                startIndex = Integer.parseInt(inputArray[1]);
                ednIndex = Integer.parseInt(inputArray[2]);
                int sum = 0;
                StringBuilder sb = new StringBuilder(text);
                if(startIndex > 0 && ednIndex < sb.length()-1){
                    for (int i = startIndex; i <= ednIndex; i++) {
                        char n = sb.charAt(i);
                        sum+= n;
                    }
                    System.out.println(sum);
                }else {
                    System.out.println("Invalid indices!");
                }


/*for (int i = 0; i <=textBuilder.length()-1; i++) {
                    if(i % 2 != 0){
                        char n = textBuilder.charAt(i);
                        oddBuilder.append(n);
                    }*/
            }
            input = scanner.nextLine();
        }
    }
}
