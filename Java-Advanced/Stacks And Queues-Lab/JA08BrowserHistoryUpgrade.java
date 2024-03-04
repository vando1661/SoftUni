package _1StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class JA08BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        ArrayDeque <String> backStacks = new ArrayDeque<>();
        ArrayDeque<String> forwardStacks = new ArrayDeque<>();
        while (!text.equals("Home")){
            if(text.equals("forward")){
                if(forwardStacks.isEmpty()) {
                    System.out.println("no next URLs");

                }
                else {
                    String currentForward = forwardStacks.pop();
                    System.out.println(currentForward);
                    backStacks.push(currentForward);
                }
            }
            else if(text.equals("back")){
                if(backStacks.size() < 2) {
                    System.out.println("no previous URLs");
                }else{
                    String currentURL = backStacks.pop();
                    forwardStacks.push(currentURL);
                    System.out.println(backStacks.peek());
                }
            }else {

                backStacks.push(text);
                System.out.println(text);
                forwardStacks.clear();


            }
            text = scanner.nextLine();
        }
    }
}
