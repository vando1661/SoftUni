package exam.Final;

import java.util.Scanner;

public class JF0201WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String allStops = scanner.nextLine();
        StringBuilder allStopsBuilder = new StringBuilder(allStops);
        String command = scanner.nextLine();
        while (!command.equals("Travel")){

            if(command.contains("Add Stop")){
                int index = Integer.parseInt(command.split(":")[1]);
                String stop = command.split(":")[2];
                if(allStopsBuilder.length()-1 >= index){
                    allStopsBuilder.insert(index,stop);

                }
            }else if(command.contains("Remove Stop")){
                int startIndex = Integer.parseInt(command.split(":")[1]);
                int endIndex = Integer.parseInt(command.split(":")[2]);
                if(allStopsBuilder.length()-1 >= startIndex && allStopsBuilder.length()-1 >= endIndex){
                    allStopsBuilder.delete(startIndex,endIndex+1);

                }

            }else if(command.contains("Switch")){
                String oldStop = command.split(":")[1];
                String newStop = command.split(":")[2];
                if(allStops.contains(oldStop)){
                    String newText = allStopsBuilder.toString().replace(oldStop,newStop);
                    allStopsBuilder = new StringBuilder(newText);
                }
            }
            System.out.println(allStopsBuilder);
            command = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + allStopsBuilder);
    }
    public static boolean isValidIndex(int index, StringBuilder builder) {
        return index >= 0 && index <= builder.length() - 1;
    }

}
