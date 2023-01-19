package exam.Final;

import java.util.Scanner;

public class JF0501ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String startKey = scanner.nextLine();
        String input = scanner.nextLine();
        String sub = "";
        while (!input.equals("Generate")) {
            String[] splitInput = input.split(">>>");
            String command = splitInput[0];
            if (command.equalsIgnoreCase("Contains")) {
                String substring = splitInput[1];
                if(startKey.contains(substring)){
                    System.out.printf("%s contains %s%n",startKey,substring);
                }else {
                    System.out.printf("Substring not found!%n");
                }
            } else if (command.equalsIgnoreCase("Slice")) {
                int startIndex = Integer.parseInt(splitInput[1]);
                int endIndex = Integer.parseInt(splitInput[2]);
                StringBuilder sb = new StringBuilder();
                sb.append(startKey);
                sb.replace(startIndex,endIndex,"");
                startKey = sb.toString();
                sb.setLength(0);
                System.out.println(startKey);

            } else if (command.equalsIgnoreCase("Flip")) {
                String substring = splitInput[1];
                int startIndex = Integer.parseInt(splitInput[2]);
                int endIndex = Integer.parseInt(splitInput[3]);
                if(substring.equals("Upper")){
                    StringBuilder sb = new StringBuilder();
                    sb.append(startKey);
                    sub = sb.substring(startIndex,endIndex);
                    sub = sub.toUpperCase();
                    sb.replace(startIndex,endIndex,sub);
                    startKey = sb.toString();
                    sb.setLength(0);
                    System.out.println(startKey);
                }else if(substring.equals("Lower")){
                    StringBuilder sb = new StringBuilder();
                    sb.append(startKey);
                    sub = sb.substring(startIndex,endIndex);
                    sub = sub.toLowerCase();
                    sb.replace(startIndex,endIndex,sub);
                    startKey = sb.toString();
                    sb.setLength(0);
                    System.out.println(startKey);


                }

            }
            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", startKey);
    }
}
