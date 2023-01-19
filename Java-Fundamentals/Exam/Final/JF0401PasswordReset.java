package exam.Final;

import java.util.Scanner;

public class JF0401PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String text = scanner.nextLine();
        StringBuilder textBuilder = new StringBuilder(text);
        while (!text.equals("Done")){
            String command = text;
            if(command.contains("TakeOdd")){
                StringBuilder oddBuilder = new StringBuilder();
                for (int i = 0; i <=textBuilder.length()-1; i++) {
                    if(i % 2 != 0){
                        char n = textBuilder.charAt(i);
                        oddBuilder.append(n);
                    }
                }
                textBuilder = oddBuilder;
                System.out.println(textBuilder);
            }else if(command.contains("Cut")){
                int index = Integer.parseInt(command.split(" ")[1]);
                int length = Integer.parseInt(command.split(" ")[2]);
                int sum = index+length;
                textBuilder.delete(index,sum);
                System.out.println(textBuilder);
            }else if(command.contains("Substitute")){
                String substring = command.split(" ")[1];
                String substitute = command.split(" ")[2];
                String builder = textBuilder.toString();
                if(builder.contains(substring)){
                    StringBuilder subBuilder = new StringBuilder();
                    builder = builder.replace(substring,substitute);
                    subBuilder.append(builder);
                    textBuilder = subBuilder;
                    System.out.println(textBuilder);
                }
                else {
                    System.out.println("Nothing to replace!");
                }
            }
            text = scanner.nextLine();
        }
        System.out.println("Your password is: "+ textBuilder);
    }
}
