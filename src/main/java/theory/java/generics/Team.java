package theory.java.generics;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Objects;

@Slf4j
public class Team<T extends Player> {

    private String name;
    int played;
    int won;
    int lost;
    int tied;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            log.error(player.getName() + " is already in the team " + this.getName());
            return false;
        } else {
            members.add(player);
            log.info(player.getName() + " was added to the team " + this.getName());
            return true;
        }
    }

    public int countPlayers() {
        return members.size();
    }


    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (ourScore < theirScore) {
            lost++;
            message = " lost to ";
        } else {
            tied++;
            message = " drew with ";
        }
        played++;
        if (!Objects.isNull(opponent)) {
            log.info(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won*2)+tied;
    }

}
