package Java_OOP._04EncapsulationExercises.jo05FootballTeamGenerator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Team> teamMap = new LinkedHashMap<>();
        while (!"END".equals(input)) {
            String[] commandParts = input.split(";");
            String commandName = commandParts[0];
            String teamName = commandParts[1];
            try {
                switch (commandName) {
                    case "Team":
                        Team teamToCreate = new Team(teamName);
                        teamMap.put(teamName, teamToCreate);
                        break;
                    case "Add":
                        String namePlayer = commandParts[2];
                        int endurance = Integer.parseInt(commandParts[3]);
                        int sprint = Integer.parseInt(commandParts[4]);
                        int dribble = Integer.parseInt(commandParts[5]);
                        int passing = Integer.parseInt(commandParts[6]);
                        int shooting = Integer.parseInt(commandParts[7]);
                        if (!teamMap.containsKey(teamName)) {
                            System.out.printf("Team %s does not exist.%n", teamName);
                        } else {
                            Player player = new Player(namePlayer, endurance, sprint, dribble, passing, shooting);
                            teamMap.get(teamName).addPlayer(player);
                        }
                        break;
                    case "Remove":
                        String removePlayer = commandParts[2];
                        teamMap.get(teamName).removePlayer(removePlayer);
                        break;
                    case "Rating":
                        if (!teamMap.containsKey(teamName)) {
                            System.out.printf("Team %s does not exist.%n", teamName);
                        } else {
                            System.out.printf("%s - %d%n", teamName, Math.round(teamMap.get(teamName).getRating()));
                        }
                        break;
                }
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            input = scanner.nextLine();
        }
    }
}

