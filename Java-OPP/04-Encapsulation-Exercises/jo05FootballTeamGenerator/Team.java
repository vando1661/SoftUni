package Java_OOP._04EncapsulationExercises.jo05FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private List<Player> players;

    public Team(String name) {
        this.teamName = name;
        this.players = new ArrayList<>();
    }

    public String getTeamName() {
        return teamName;
    }

    private void setTeamName(String teamName) {
        if(teamName.trim().isEmpty()){
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.teamName = teamName;
    }
    public void addPlayer(Player player){
        players.add(player);


    }
    public void removePlayer(String namePlayer){
       boolean isRemoved =  players.removeIf(player -> player.getName().equals(namePlayer));
       if(!isRemoved){
           String error = String.format("Player %s is not in %s team.",namePlayer,teamName);
           throw new IllegalArgumentException(error);
       }
    }
    public double getRating(){
      return players
              .stream()
              .mapToDouble(Player::overallSkillLevel)
              .average().orElse(0);
    }
}
