package exam.Final;

import java.util.Scanner;

public class JF0101TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();


        String inputText = scanner.nextLine();

        while (!inputText.equals("Decode")){
            String [] commandArr = inputText.split("\\|");
            String command = commandArr[0];
            switch (command){
                case "ChangeAll":
                    String oldLetter = commandArr[1];
                    String newLetter = commandArr[2];

                    if(message.contains(oldLetter)){
                        message = message.replace(oldLetter,newLetter);
                    }
                    break;
                case "Insert":
                    StringBuilder builder = new StringBuilder();
                    int index = Integer.parseInt(commandArr[1]);
                    String insertText = commandArr[2];

                    builder.append(message);
                    builder.insert(index,insertText);
                    message = builder.toString();

                    break;
                case "Move":
                    StringBuilder stringBuilder = new StringBuilder();
                    int numLetter = Integer.parseInt(commandArr[1]);
                    stringBuilder.append(message,numLetter,message.length());
                    message = message.substring(0,numLetter);
                    stringBuilder.append(message);
                    message = stringBuilder.toString();
                    break;
            }
            inputText = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + message );
    }
    }

