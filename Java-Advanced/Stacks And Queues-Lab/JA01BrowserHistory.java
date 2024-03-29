package Java_Advance._1StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class JA01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String text = scanner.nextLine();
        ArrayDeque <String> stacksArray = new ArrayDeque<>();
        String currentURL = "blank";
        while (!text.equals("Home")){
            if(text.equals("back")){
                if(!stacksArray.isEmpty()){
                    currentURL = stacksArray.pop();
                }else {
                    System.out.println("no previous URLs");
                    text = scanner.nextLine();
                    continue;
                }
            }else {
                if(!currentURL.equals("blank")){
                    stacksArray.push(currentURL);
                }
                currentURL = text;
            }
                System.out.println(currentURL);
            text = scanner.nextLine();
        }
    }
}

