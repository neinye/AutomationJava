package theory.java.generics;

import lombok.extern.slf4j.Slf4j;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

@Slf4j
public class TeamTest {

    FootballPlayer andrew = new FootballPlayer("Andrew");
    FootballPlayer michael = new FootballPlayer("Michael");
    SoccerPlayer christian = new SoccerPlayer("Christian");
    SoccerPlayer carl = new SoccerPlayer("Carl");
    BaseballPlayer val = new BaseballPlayer("Val");
    BaseballPlayer steve = new BaseballPlayer("Steve");

    Team<FootballPlayer> footballFirstTeam = new Team<>("first football");
    Team<FootballPlayer> footballSecondTeam = new Team<>("second football");
    Team<SoccerPlayer> soccerFirstTeam = new Team<>("first soccer");
    Team<SoccerPlayer> soccerSecondTeam = new Team<>("second soccer");
    Team<BaseballPlayer> baseballFirstTeam = new Team<>("first baseball");
    Team<BaseballPlayer> baseballSecondTeam = new Team<>("second baseball");

    @Test
    void matchResult() {
        footballFirstTeam.addPlayer(andrew);
        footballSecondTeam.addPlayer(michael);
        footballFirstTeam.matchResult(footballSecondTeam, 2, 0);
        MatcherAssert.assertThat("The team should have one win", footballFirstTeam.won, Matchers.equalTo(1));
    }

    @Test
    void ranking() {
    }
}